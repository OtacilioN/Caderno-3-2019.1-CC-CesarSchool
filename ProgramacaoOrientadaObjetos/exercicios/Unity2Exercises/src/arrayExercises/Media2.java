package arrayExercises;

import java.util.ArrayList;
import java.util.Scanner;


public class Media2 {
	
	public static double getMedia(ArrayList<Double> list) {
		double sum = 0;
		for(double value : list) {
			sum += value;
		}
		if(sum == 0)
			return 0;
		return sum / list.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		while(true) {
			double value = input.nextDouble();
			if(value == 0.001) 
				break;
			list.add(value);
		}
		System.out.println(Media2.getMedia(list));
	}

}
