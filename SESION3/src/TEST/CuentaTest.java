package TEST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	@Test
	void testPrincipal() {
		Cuenta cuenta = new Cuenta() ; 
		cuenta.ingresar(100.00) ;
		
		assertEquals(100, cuenta.getSaldo()) ; 
	}

}
