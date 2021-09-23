package patronesDesign.entidades;

import java.sql.SQLException;

import patronesDesign.logica.CuentaLogica;

public class transferenciaMovimiento extends TipoMovimiento {

    private String cuentaReferencia="";

    public transferenciaMovimiento(String c) {
        this.cuentaReferencia=c;
    }

    
    
    public void setCuentaReferencia(String cuentaReferencia) {
        this.cuentaReferencia = cuentaReferencia;
    }

    public String getCuentaReferencia() {
        return cuentaReferencia;
    }

    @Override
    public boolean movimiento() {
        boolean accion = false;
        try {
            Cuenta cDestion = CuentaLogica.findAccountByCod(getCuentaReferencia());
            accion = CuentaLogica.movimiento(this.getCuenta().getCuenCodigo(), getCuentaReferencia(), 1, this.getMovImporte());
        } catch (SQLException e) {
            accion = false;
            e.printStackTrace();
        }
        return accion;
    }

}
