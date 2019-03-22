public class PainelDeSenha {
	int senha = 0;
	
	public void chamarProximo() {
		this.senha = this.senha + 1;
		
		if(this.senha > 99) {
			this.senha = 0;
		}
		if(this.senha < 10) {
			System.out.print("0");
		}
		System.out.println(this.senha);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PainelDeSenha meuPainel = new PainelDeSenha();

		int x = 0;
		for (x = 0; x < 1000; x++) {
			meuPainel.chamarProximo();
		}

	}

}
