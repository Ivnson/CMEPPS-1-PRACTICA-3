package SESION3_PACKAGE;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	public Cuenta() {
		super();
	}

	String mNumero;
    String mTitular;
    public List<Movimiento> mMovimientos = new ArrayList<>() ; 
    
    private double saldo = 0.0 ; 

    public void ingresar(double cantidad) {
        this.saldo += cantidad; 
        
        this.mMovimientos.add(new Movimiento(cantidad, Movimiento.Signo.H, "INGRESO")) ; 
    }

    public void retirar(double cantidad) {
    	if (this.saldo - cantidad >= -500.00)
    	{
    		this.saldo -= cantidad ; 
    		
    		this.mMovimientos.add(new Movimiento(cantidad, Movimiento.Signo.D, "Reintegro en efectivo"));
    	}
    	else {
            System.out.println("Fondos insuficientes (saldo " + this.saldo + "€) para el reintegro de " + cantidad + "€");
        }
    }
    
    
    public double getSaldo() {
        return this.saldo ; 
    }
}
