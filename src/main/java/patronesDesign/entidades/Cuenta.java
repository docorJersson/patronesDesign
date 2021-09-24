package patronesDesign.entidades;

import java.util.Date;

public class Cuenta {
	
	private String cuenCodigo;
	private String moneCodigo;
	private String sucuCodigo;
	private String empleCreaCuenta;
	private String cliCodigo;
	private float cuenSaldo;
	private Date cuenFechaCreacion;
	private String cuenEstado;
	private String cuenContMov;
	private String cuenClave;
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}

	public String getCuenCodigo() {
		return cuenCodigo;
	}

	public void setCuenCodigo(String cuenCodigo) {
		this.cuenCodigo = cuenCodigo;
	}

	public String getMoneCodigo() {
		return moneCodigo;
	}

	public void setMoneCodigo(String moneCodigo) {
		this.moneCodigo = moneCodigo;
	}

	public String getSucuCodigo() {
		return sucuCodigo;
	}

	public void setSucuCodigo(String sucuCodigo) {
		this.sucuCodigo = sucuCodigo;
	}

	public String getEmpleCreaCuenta() {
		return empleCreaCuenta;
	}

	public void setEmpleCreaCuenta(String empleCreaCuenta) {
		this.empleCreaCuenta = empleCreaCuenta;
	}

	public String getCliCodigo() {
		return cliCodigo;
	}

	public void setCliCodigo(String cliCodigo) {
		this.cliCodigo = cliCodigo;
	}

	public float getCuenSaldo() {
		return cuenSaldo;
	}

	public void setCuenSaldo(float cuenSaldo) {
		this.cuenSaldo = cuenSaldo;
	}

	public Date getCuenFechaCreacion() {
		return cuenFechaCreacion;
	}

	public void setCuenFechaCreacion(Date cuenFechaCreacion) {
		this.cuenFechaCreacion = cuenFechaCreacion;
	}

	public String getCuenEstado() {
		return cuenEstado;
	}

	public void setCuenEstado(String cuenEstado) {
		this.cuenEstado = cuenEstado;
	}

	public String getCuenContMov() {
		return cuenContMov;
	}

	public void setCuenContMov(String cuenContMov) {
		this.cuenContMov = cuenContMov;
	}

	public String getCuenClave() {
		return cuenClave;
	}

	public void setCuenClave(String cuenClave) {
		this.cuenClave = cuenClave;
	}
	

}
