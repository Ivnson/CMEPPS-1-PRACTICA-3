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

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Signo getSigno() {
		return signo;
	}

	public void setSigno(Signo signo) {
		this.signo = signo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
    
}