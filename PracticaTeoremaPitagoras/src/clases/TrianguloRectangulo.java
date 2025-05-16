package clases;

/**
 * @author Gabriel Rey Vilchez 1B DAW
 */
public class TrianguloRectangulo {
	
	private int a;
	private int b;
	private int c;
	
	/**
	 * Constructor sin parametros
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	/**
	 * 
	 * @param cateto1 si es menor a 0 se lanza IllegalArgumentException
	 * @param cateto2 si es menor a 0 se lanza IllegalArgumentException
	 * Constructor con parametros
	 */
	public TrianguloRectangulo(int cateto1, int cateto2) {
		if (cateto1 <= 0 || cateto2 <= 0) throw new IllegalArgumentException();
		this.a = cateto1;
		this.b = cateto2;
	}
	/**
	 * Area del triangulo rectangulo
	 * @return devuelve area
	 */
	public double area() {
		return (this.a*this.b)/2;
	}
	/**
	 * Calcular la hipotenusa y darle valor a c
	 * @return devuelve hipotenusa
	 */
	public double hipotenusa() {
		this.c = (this.a*this.a)+(this.b*this.b);
		return Math.sqrt(this.c);
	}
	/**
	 * Calcular perimetro llamando a hipotenusa()
	 * @return devuelve perimetro
	 */
	public double perimetro() {
		return (this.a + this.b + this.hipotenusa());
	}
	/**
	 * Setter a
	 * @param a
	 */
	public void seta(int a) {
		this.a = a;
	}
	/**
	 * Setter b
	 * @param b
	 */
	public void setb(int b) {
		this.b = b;
	}
	/**
	 * Getter a
	 * @return a
	 */
	public int geta() {
		return this.a;
	}
	/**
	 * Getter b
	 * @return b
	 */
	public int getb() {
		return this.b;
	}
	/**
	 * Metodo toString que devuelve todos los lados
	 * @return valores
	 */
	public String toString() {
		String cadena = "Valor a: "+this.a+"\n";
		cadena = "Valor b: "+this.b+"\n";
		cadena = "Valor c: "+this.c;
		return cadena;
	}
}
