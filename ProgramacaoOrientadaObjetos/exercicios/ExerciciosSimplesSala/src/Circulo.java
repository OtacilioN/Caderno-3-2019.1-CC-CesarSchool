
public class Circulo {
	
	private final float raio;
	private static final int graus = 360;

	public Circulo(float raio) {
		// TODO Auto-generated constructor stub
		this.raio = raio;
	}
	
	public static int getGraus() {
		return graus;
	}
	
	public double areaCirculo() {
		return Math.PI * (this.raio * this.raio);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo myCirculo = new Circulo(2.5f);
		System.out.println(myCirculo.areaCirculo());
		System.out.println(Circulo.getGraus());
	}

}
