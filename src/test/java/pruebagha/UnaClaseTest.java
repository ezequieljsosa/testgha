package pruebagha;

import org.junit.jupiter.api.Assertions;

public class UnaClaseTest {

	public void testUnaClase4() {
		UnaClase unObj = new UnaClase(2);
		OtraClase oc = new OtraClase();
		oc.setValor(2);
		Assertions.assertEquals(4,unObj.potenciar(oc));			
	}
	
	public void testUnaClaseCero() {
		UnaClase unObj = new UnaClase(0);
		OtraClase oc = new OtraClase();
		oc.setValor(2);
		Assertions.assertEquals(1,unObj.potenciar(oc));			
	}

}
