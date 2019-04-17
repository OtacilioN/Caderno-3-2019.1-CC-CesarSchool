package ArrayExercises;
import java.util.Random;

public class Verificador {
	// Not allowed to use sorting and any additional data structure
	public static boolean hasDuplicateds(int [] input) {
		for(int x = 0; x < input.length-1; x++) {
			for(int y = x+1; y < input.length; y++) {
				if(input[x] == input[y]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int maxIndex = 20;
		final int maxRand = 31;
		Random rand = new Random();
		int [] input = new int [maxIndex];
		for(int x = 0; x < maxIndex; x++) {
			input[x] = rand.nextInt(maxRand);
		}
		System.out.println(Verificador.hasDuplicateds(input));
	}

}
