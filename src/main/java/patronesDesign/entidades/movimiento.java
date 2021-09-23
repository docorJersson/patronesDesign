package patronesDesign.entidades;

import java.util.Date;

public class movimiento {
	private int moviNumero;
	private Cuenta cuenta;
	private Date moviFecha;
	private TipoMovimiento tipoMovimiento;
	private float movImporte;
	
	public int getMoviNumero() {
		return moviNumero;
	}
	public void setMoviNumero(int moviNumero) {
		this.moviNumero = moviNumero;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public Date getMoviFecha() {
		return moviFecha;
	}
	public void setMoviFecha(Date moviFecha) {
		this.moviFecha = moviFecha;
	}
	
	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public float getMovImporte() {
		return movImporte;
	}
	public void setMovImporte(float movImporte) {
		this.movImporte = movImporte;
	}
	
	
	
	
	
}
