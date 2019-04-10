public class ReverseString {
	public String reverter(String original) {
		String revertida = "";
		for(int x = original.length(); x > 0; x--) {
			char atualCaracter = original.charAt(x-1);
			System.out.print(atualCaracter);
			revertida = revertida + atualCaracter;
		}
		System.out.println();
		return revertida;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString myReverse = new ReverseString();
		System.out.println(myReverse.reverter("poc poc no teu gelo")); 
		
	}
}
