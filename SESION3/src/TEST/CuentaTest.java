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
}
