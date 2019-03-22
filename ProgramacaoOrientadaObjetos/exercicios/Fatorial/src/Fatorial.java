
public class Fatorial {
	public int calcular(int valor) {
		int resultado = 1;
		if(valor < 0) {
			System.out.println("Valor nao permitido i.e > 0");
			return 0;
		}
		while(valor > 0) {
			resultado = resultado * valor;
			valor = valor -1;
		}
		return resultado;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fatorial meuFat = new Fatorial();
		System.out.println(meuFat.calcular(3));
	}

}
