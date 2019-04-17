package school.cesar.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Despesas {
	
	public Despesas(ArrayList<Double> array) {
		super();
		this.array = array;
	}

	ArrayList<Double> array = new ArrayList<Double>();
	
	public double getMaiorDespesa() {
		double maior = this.array.get(0);
		for(double value:this.array) {
			if(value > maior)
				maior = value;
		}
		return maior;
	}
	
	public double getMenorDespesa() {
		double menor = this.array.get(0);
		for(double value:this.array) {
			if(value < menor)
				menor = value;
		}
		return menor;
	}
	public double getMedia() {
		double sum = 0;
		for(double value:this.array) {
			sum += value;
		}
		return sum / this.array.size();
	}

	@Override
	public String toString() {
		return "Despesas [array=" + array + ", getMaiorDespesa()=" + getMaiorDespesa() + ", getMenorDespesa()="
				+ getMenorDespesa() + ", getMedia()=" + getMedia() + "]";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> myArray = new ArrayList<Double>();
		String readValue;
		do {
			readValue = input.next();
			if(!readValue.equals("Parar")) {
				myArray.add(Double.parseDouble(readValue));
			}
		}while(!readValue.equals("Parar"));
		
		Despesas desp = new Despesas(myArray);
		
		System.out.println(desp);
		
		input.close();
	}
}
