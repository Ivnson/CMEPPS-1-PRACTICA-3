package TEST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import SESION3_PACKAGE.Cuenta;

class CuentaTest {

	Cuenta cuenta = null; 
	
	@BeforeEach
	void setUp() throws Exception
	{
		cuenta = new Cuenta() ; 
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(100.00);
		assertEquals(100.00, cuenta.getSaldo());
	}

	@Test
	void testRetirar() {
		cuenta.ingresar(100.00);
		cuenta.retirar(30.00);
		assertEquals(70.00, cuenta.getSaldo());
	}
	
	@Test
	void test0014() {
		
		Cuenta cuenta12345 = new Cuenta();
		cuenta12345.ingresar(50.00);

		Cuenta cuenta67890 = new Cuenta();
		cuenta67890.ingresar(0.00);  
		
		System.out.println("CUENTA 12345 ->") ;
		System.out.println(cuenta12345.getSaldo()) ;
		cuenta12345.retirar(200.00); // 1
		System.out.println(cuenta12345.getSaldo()) ;
		
		System.out.println("CUENTA 67890 ->") ;
		cuenta67890.retirar(350.00); // 2
		System.out.println(cuenta67890.getSaldo()) ;
		
		
		System.out.println("CUENTA 12345 ->") ;
		cuenta12345.ingresar(100.00); // 3
		System.out.println(cuenta12345.getSaldo()) ;
		
		System.out.println("CUENTA 67890 ->") ;
		cuenta67890.retirar(200.00); // 4 (Este falla por fondos insuficientes)
		System.out.println(cuenta67890.getSaldo()) ;
		
		System.out.println("CUENTA 67890 ->") ;
		cuenta67890.retirar(150.00); // 5
		System.out.println(cuenta67890.getSaldo()) ;
		
		System.out.println("CUENTA 12345 ->") ;
		cuenta12345.retirar(200.00); // 6
		System.out.println(cuenta12345.getSaldo()) ;
		
		System.out.println("CUENTA 67890 ->") ;
		cuenta67890.ingresar(50.00);  // 7
		System.out.println(cuenta67890.getSaldo()) ;
		
		System.out.println("CUENTA 67890 ->") ;
		cuenta67890.retirar(100.00); // 8 (Este falla por fondos insuficientes)
		System.out.println(cuenta67890.getSaldo()) ;

		// Resultados esperados
		assertEquals(-250.00, cuenta12345.getSaldo(), "El saldo de 12345 debe ser -250€");
		System.out.println(cuenta12345.getSaldo()) ; 
		assertEquals(-450.00, cuenta67890.getSaldo(), "El saldo de 67890 debe ser -450€");
		System.out.println(cuenta67890.getSaldo()) ; 
	}
}
