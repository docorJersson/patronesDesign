package patronesDesign.entidades;

import java.sql.SQLException;

import patronesDesign.logica.CuentaLogica;

public class transferenciaMovimiento extends TipoMovimiento {

	private String cuentaReferencia;

	public transferenciaMovimiento(String cuentaReferencia) {
		this.cuentaReferencia = cuentaReferencia;
	}

	@Override
	public boolean movimiento() {
		boolean accion=false;
		try {
			Cuenta cDestion=CuentaLogica.findAccountByCod(cuentaReferencia);
			accion=CuentaLogica.movimiento(this.getCuenta().getCuenCodigo(), cuentaReferencia, 1, this.getMovImporte());
		} catch (SQLException e) {
			accion=false;
			e.printStackTrace();
		}
		return accion;
	}

}
