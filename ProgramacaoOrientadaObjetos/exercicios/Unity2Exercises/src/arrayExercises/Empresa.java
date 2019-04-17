package arrayExercises;

public class Empresa {
	private String nome;
	private String cNPJ;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return cNPJ;
	}

	public void setCNPJ(String cNPJ) {
		this.cNPJ = cNPJ;
	}
	
	public String toString() {
		return "Nome: " + this.getNome() + " CNPJ: " + this.getCNPJ();
	}
	
	// TODO
	public int hashcode() {
		final int prime = 53;
		int result = 1;
		result = prime * result; // TODO
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
