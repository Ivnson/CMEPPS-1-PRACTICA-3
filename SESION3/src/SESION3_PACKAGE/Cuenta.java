package SESION3_PACKAGE;

import java.util.ArrayList;
import java.util.List;

enum Movimiento{
	D,H ; 
}

public class Cuenta {
	
	public Cuenta() {
		super();
	}

	String mNumero;
    String mTitular;
    List<Movimiento> mMovimientos = new ArrayList<>() ; 
    
    private double saldo = 0.0 ; 

    public void ingresar(double x) {
        this.saldo += x ; 
    }

    public void retirar(double x) {
        
    }
    
    
    public double getSaldo() {
        return this.saldo ; 
    }
}
