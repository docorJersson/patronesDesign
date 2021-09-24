/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesDesign.logica;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import static java.time.Instant.now;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import patronesDesign.conexion.Conexion;
import patronesDesign.entidades.TipoMovimiento;
import patronesDesign.entidades.estandarMovimiento;
import patronesDesign.entidades.movimiento;
import patronesDesign.entidades.transferenciaMovimiento;
import patronesDesign.operaciones.MovimientoOperacion;

public class movimientosLogica {

    static PreparedStatement ps;
    static Connection cs;
    static ResultSet rs;
    static CallableStatement ct;

    public static ArrayList<TipoMovimiento> listMovimientos() {
        String sql = "select * from tipomovimiento";
        ArrayList<TipoMovimiento> lista = new ArrayList<TipoMovimiento>();

        try {
            cs = Conexion.getConexion();
            ps = cs.prepareStatement(sql);
            rs = ps.executeQuery();
            TipoMovimiento tM = null;
            while (rs.next()) {
                tM = new estandarMovimiento();
                tM.setTipoCodigo(rs.getString(1));
                tM.setTipoDescripcion(rs.getString(2));
                tM.setTipoAccion(rs.getString(3));
                tM.setTipoEstado(rs.getString(4));
                lista.add(tM);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(movimientosLogica.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.disconnect();
            } catch (SQLException ex) {
                Logger.getLogger(movimientosLogica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public static boolean saveMovimiento(TipoMovimiento m, String c) {
        boolean accion = false;
        String sql = "insert into movimiento values (?,?,?,?,?,?,?)";
        try {
            cs = Conexion.getConexion();
            ps = cs.prepareStatement(sql);
            ps.setString(1, m.getCuenta().getCuenCodigo());
            ps.setInt(2, m.getMoviNumero());
            ps.setDate(3, new java.sql.Date(Date.from(now()).getTime()));
            ps.setString(4, m.getEmpleado().getCodigo());
            ps.setString(5, m.getTipoCodigo());
            ps.setFloat(6, m.getMovImporte());
            String destino = (m instanceof transferenciaMovimiento) ? c : "";
            ps.setString(7, destino);
            ps.execute();
            m.movimiento();
            accion = true;
        } catch (SQLException ex) {
            Logger.getLogger(movimientosLogica.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.disconnect();
            } catch (SQLException ex) {
                Logger.getLogger(movimientosLogica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return accion;
    }

    public static int numeroMovimiento(String cuenta) {
        String sql = "{call numeroMov(?,?)}";
        int numero = 0;
        try {
            cs = Conexion.getConexion();
            ct = cs.prepareCall(sql);
            ct.setString(1, cuenta);
            ct.registerOutParameter(2, Types.INTEGER);
            ct.executeUpdate();
            numero = ct.getInt(2);
            ct.close();
        } catch (SQLException ex) {
            Logger.getLogger(movimientosLogica.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                Conexion.disconnect();
            } catch (SQLException ex) {
                Logger.getLogger(movimientosLogica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return numero;
    }
}
