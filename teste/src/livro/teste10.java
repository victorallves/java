package livro;

import java.util.ArrayList;
import java.util.Scanner;

public class teste10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		double n1 = ler.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double n2 = ler.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		double n3 = ler.nextDouble();
		System.out.println("Digite o quarto valor: ");
		double n4 = ler.nextDouble();
		System.out.println("Digite o quinto valor: ");
		double n5 = ler.nextDouble();
		System.out.println("Digite o sexto valor: ");
		double n6 = ler.nextDouble();

		ArrayList<Double> numeros = new ArrayList<Double>();

		numeros.add(n1);
		numeros.add(n2);
		numeros.add(n3);
		numeros.add(n4);
		numeros.add(n5);
		numeros.add(n6);

		int contador = 0;
		for (Double n : numeros) {
			if (n >= 0) {
				contador++;
			}
		}

		System.out.println(contador + " valores positivos");

		ler.close();
	}

}