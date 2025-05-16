package test;
import clases.TrianguloRectangulo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testTrianguloRectangulo {
	
	static TrianguloRectangulo tri;
	static TrianguloRectangulo tri2;
	
	@BeforeAll
	static void setup() {
		tri = new TrianguloRectangulo() {};
	}
	@BeforeAll
	static void setup2() {
		tri2 = new TrianguloRectangulo(4,5) {};
	}
	
	//Testear area
	@Test
	void testarea() {
		assertEquals(0, tri.area());
		assertEquals(10, tri2.area());
	}
	
	//Testear perimetro
	@Test
	void testperimetro() {
		assertEquals(3.414213562373095, tri.perimetro());
		assertEquals(15.403124237432849, tri2.perimetro());
	}
	
	//Testear perimetro
	@Test
	void testhipotenusa() {
		assertEquals(1.4142135623730951, tri.hipotenusa());
		assertEquals(6.4031242374328485, tri2.hipotenusa());
	}
		
	@Test
	void testTrianguloRectanguloIntInt() {
		assertThrows(IllegalArgumentException.class,() -> {
			TrianguloRectangulo tri3 = new TrianguloRectangulo(-1,5);
		});
	}

}
