package fempa.ejercicio5;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		int min = 0;
		int max = 10;
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		int numeroRandom1 = r.nextInt((max - min) + 1) + min;

		System.out.println(numeroRandom1);
	}
}
