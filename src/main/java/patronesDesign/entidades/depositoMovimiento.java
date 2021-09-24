package patronesDesign.entidades;

import patronesDesign.logica.CuentaLogica;

public class depositoMovimiento extends TipoMovimiento {

	@Override
	public boolean movimiento() {
		boolean accion = false;
		try {
			float nuevoMonto = super.getCuenta().getCuenSaldo() + super.getMovImporte();
			super.getCuenta().setCuenSaldo(nuevoMonto);
			accion = CuentaLogica.movimiento(this.getCuenta().getCuenCodigo(), null, 2, this.getMovImporte());
		} catch (Exception e) {
			accion = false;
		}
		return accion;
	}

}
