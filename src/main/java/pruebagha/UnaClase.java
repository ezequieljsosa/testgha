package pruebagha;



public class UnaClase {

	private int potencia;

	public UnaClase(int potencia) {
		super();
		this.potencia = potencia;
	}
	
	public double potenciar(OtraClase otra) {
		return Math.pow( otra.getValor()  ,  this.potencia);
	}
	
	
}
