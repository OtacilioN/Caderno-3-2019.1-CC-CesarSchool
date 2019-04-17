package arrayExercises;

public class Media {
	
	public static double getMedia(double ...samples) {;
		double sum = 0;
		for(double sample : samples) {
			sum += sample;
		}
		return sum/samples.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Media.getMedia(1, 2, 3, 4, 5));
	}	

}
