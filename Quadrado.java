
public class Quadrado implements AreaCalculavel{
	
	private int lado;
	
	public double calcularArea() {
		return lado * lado;
	}
	
	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}

}
