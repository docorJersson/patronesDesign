package patronesDesign.entidades;

import java.time.LocalDate;
import java.util.Date;

public class movimiento {

    private int moviNumero;
    private Cuenta cuenta;
    private LocalDate moviFecha;
    private float movImporte;
    private empleado empleado;

    public empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(empleado empleado) {
        this.empleado = empleado;
    }

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

    public LocalDate getMoviFecha() {
        return moviFecha;
    }

    public void setMoviFecha(LocalDate moviFecha) {
        this.moviFecha = moviFecha;
    }

    public float getMovImporte() {
        return movImporte;
    }

    public void setMovImporte(float movImporte) {
        this.movImporte = movImporte;
    }

}
