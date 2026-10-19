package SESION3_PACKAGE;

public class Movimiento {
    public enum Signo { D, H }
    
    public double importe;
    public Signo signo;
    public String detalle;

    // Constructor para crear el objeto fácilmente
    public Movimiento(double importe, Signo signo, String detalle) {
        this.importe = importe;
        this.signo = signo;
        this.detalle = detalle;
    }
}