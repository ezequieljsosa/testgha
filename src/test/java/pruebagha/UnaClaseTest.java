package pruebagha;

import org.junit.jupiter.api.Assertions;

public class UnaClaseTest {

	public void testUnaClaseTrue() {
		UnaClase unObj = new UnaClase(2);
		OtraClase oc = new OtraClase();
		oc.setValor(2);
		Assertions.assertEquals(4,unObj.potenciar(oc));			
	}
	
}
