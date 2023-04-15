package pruebagha;

import org.junit.jupiter.api.Assertions;

public class OtraClaseTest {

	public void testOtraClaseTrue() {
		OtraClase unObj = new OtraClase();
		Assertions.assertEquals(unObj,1);
			
	}
	
	public void testOtraClaseFalso() {
		OtraClase unObj = new OtraClase();
		Assertions.assertFalse(unObj.equals(false));
			
	}
	
}
