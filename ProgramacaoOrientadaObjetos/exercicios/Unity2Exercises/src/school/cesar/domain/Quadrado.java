package school.cesar.domain;
import static school.cesar.util.Calculadora.qdrd;

public class Quadrado {
	public double lado;
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	public double getDiagonal(double lado) {
		return lado*qdrd(2);
	}
	
}
