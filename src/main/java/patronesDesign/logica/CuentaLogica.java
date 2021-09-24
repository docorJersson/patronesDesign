package patronesDesign.logica;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import patronesDesign.conexion.Conexion;
import patronesDesign.entidades.Cuenta;

public class CuentaLogica {

    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Connection con;

    public static boolean movimiento(String cuentaOrigen, String cuentaDestino, int tipo, float monto) {
        boolean accion = false;
        String sql = "{call movimiento (?,?,?,?)}";
        try {
            con = Conexion.getConexion();
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, cuentaOrigen);
            cs.setString(2, cuentaDestino);
            cs.setInt(3, tipo);
            cs.setFloat(4, monto);
            cs.execute();
            accion = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accion;
    }

    public static Cuenta findAccountByCod(String codigo) throws SQLException {
        Cuenta c = null;
        String sql = "select * from cuenta where cuencodigo=?";
        try {
            con = Conexion.getConexion();
            con.setAutoCommit(false);
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while (rs.next()) {
                c = new Cuenta();
                c.setCuenCodigo(rs.getString(1));
                c.setMoneCodigo(rs.getString(2));
                c.setSucuCodigo(rs.getString(3));
                c.setEmpleCreaCuenta(rs.getString(4));
                c.setCliCodigo(rs.getString(5));
                c.setCuenSaldo(rs.getFloat(6));
                c.setCuenFechaCreacion(rs.getDate(7));
                c.setCuenEstado(rs.getString(8));
                c.setCuenContMov(rs.getString(9));
                c.setCuenClave(rs.getString(10));
            }
            rs.close();
            ps.close();
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.disconnect();
        }
        return c;
    }

    public static ArrayList<Cuenta> listCuenta() throws SQLException {
        String sql = "select * from cuenta";
        ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Cuenta c = null;
            while (rs.next()) {
                c = new Cuenta();
                c.setCuenCodigo(rs.getString(1));
                c.setMoneCodigo(rs.getString(2));
                c.setSucuCodigo(rs.getString(3));
                c.setEmpleCreaCuenta(rs.getString(4));
                c.setCliCodigo(rs.getString(5));
                c.setCuenSaldo(rs.getFloat(6));
                c.setCuenFechaCreacion(rs.getDate(7));
                c.setCuenEstado(rs.getString(8));
                c.setCuenContMov(rs.getString(9));
                c.setCuenClave(rs.getString(10));
                lista.add(c);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CuentaLogica.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexion.disconnect();
        }
        return lista;
    }
}
