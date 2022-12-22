package livro;

import java.util.Scanner;

public class Teste12 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int contador = ler.nextInt();
		
		for (int i = 1; i <= contador; i++) {
			
			if (i % 2 != 0) {
				System.out.printf("%d\n", i);
				
			}
			
		}
		ler.close();
	}
	
}