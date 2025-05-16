package app;
import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		
		//Varibles para calculos
		double area1;
		double area2;
		double perimetro1;
		double perimetro2;
		double hipotenusa1;
		double hipotenusa2;
		//Valores para dar como parametro
		int cat1 = 4;
		int cat2 = 5;
		
		//Nuevo rectangulo con parametros
		TrianguloRectangulo tri1 = new TrianguloRectangulo(cat1, cat2);
		
		//Nuevo rectangulo con valores por defecto
		TrianguloRectangulo tri2 = new TrianguloRectangulo ();
		
		//Calcular la hipotenusa de los triangulos
		hipotenusa1 = tri1.hipotenusa();
		hipotenusa2 = tri2.hipotenusa();
		
		//Calcular area triangulos
		area1 = tri1.area();
		area2 = tri2.area();
		
		//Calcular perimetro
		perimetro1 = tri1.perimetro();
		perimetro2 = tri2.perimetro();
	}

}
