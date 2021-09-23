package patronesDesign.entidades;

import patronesDesign.logica.CuentaLogica;

public class retiroMovimiento extends TipoMovimiento {

	@Override
	public boolean movimiento() {
		boolean accion = false;
		System.out.println("Retirando ..");
		if (super.getCuenta().getCuenSaldo() - super.getMovImporte() >= 0) {
			float cantidad = super.getCuenta().getCuenSaldo() - super.getMovImporte();
			super.getCuenta().setCuenSaldo(super.getCuenta().getCuenSaldo() - super.getMovImporte());
			accion = CuentaLogica.movimiento(this.getCuenta().getCuenCodigo(), null, 3, this.getMovImporte());
			;
		} else {
			accion = false;
		}
		return accion;
	}

}
