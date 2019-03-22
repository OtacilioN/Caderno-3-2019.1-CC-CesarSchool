package firstClass;

public class Motor {
	
	private float quantidadeOleo = 15;
	private int potencia;
	private String tipo; 
	
	
	public float getQuantidadeOleo() {
		return this.quantidadeOleo;
	}
	public void setQuantidadeOleo(float quantidadeOleo) {
		this.quantidadeOleo = quantidadeOleo;
	}
	
	public int getPotencia() {
		return this.potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	private void consumirOleo(float consumido) {
		this.quantidadeOleo = this.quantidadeOleo - consumido;
	}
	
	public void acelerar() {
		System.out.println("acelerando!");
		this.consumirOleo(1.2f);
		System.out.println(this.getQuantidadeOleo());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor meuMotor = new Motor();
		meuMotor.acelerar();
	}

}
