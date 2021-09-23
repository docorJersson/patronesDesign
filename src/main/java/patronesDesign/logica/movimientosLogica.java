/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesDesign.logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import patronesDesign.conexion.Conexion;
import patronesDesign.entidades.TipoMovimiento;
import patronesDesign.entidades.estandarMovimiento;

/**
 *
 * @author Jersson Chilon
 */
public class movimientosLogica {
    static PreparedStatement ps;
    static Connection cs;
    static ResultSet rs;
    
    public static ArrayList<TipoMovimiento> listMovimientos()
    {
        String sql="select * from tipomovimiento";
            ArrayList<TipoMovimiento> lista=new ArrayList<TipoMovimiento>();

        try {
            cs=Conexion.getConexion();
            ps=cs.prepareStatement(sql);
            rs=ps.executeQuery();
            TipoMovimiento tM=null;
            while(rs.next())
            {
                tM=new estandarMovimiento();
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
        }
        finally
        {
            try {
                Conexion.disconnect();
            } catch (SQLException ex) {
                Logger.getLogger(movimientosLogica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
}
