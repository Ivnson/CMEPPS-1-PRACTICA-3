package TEST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import SESION3_PACKAGE.Cuenta;

class CuentaTest {

	@Test
	void testIngresar() {
		Cuenta cuenta = new Cuenta() ; 
		cuenta.ingresar(100.00) ;
		
		assertEquals(100.00, cuenta.getSaldo()) ; 
	}

}
