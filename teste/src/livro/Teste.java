package livro;

import java.util.*;

public class Teste {

	public static void main(String[] args) {
		
		    
		        	Scanner ler = new Scanner(System.in);
					System.out.print("Insira a primeira nota: ");
					double N1 = ler.nextDouble();
					
					System.out.print("Insira a segunda nota: ");
					double N2 = ler.nextDouble();
					
					System.out.print("Insira a terceira nota: ");
					double N3 = ler.nextDouble();
					
					System.out.print("Insira a quarta nota: ");
					
					double N4 = ler.nextDouble();
					
					double MEDIA = (N1*2 + N2*3 + N3*4 + N4*1) / 10;
					
					System.out.printf("Media: %.2f%n", MEDIA);
					
						if(MEDIA >= 7) {
						System.out.println("Aluno aprovado.");
						
						}else if (MEDIA < 7 && MEDIA >= 5) {
						System.out.println("Aluno em exame.");
						
						double NExame = ler.nextDouble();
						
						System.out.printf("Nota do exame: %.2f%n", NExame);
						
						MEDIA = (MEDIA + NExame) / 2;
						
						if (MEDIA >= 5) {
					    	System.out.println("Aluno aprovado.");
					    	
						}else {
					    	System.out.println("Aluno reprovado.");
						}
						
						System.out.printf("Media final: %.2f%n", MEDIA);
						
					    }else {
						System.out.println("Aluno reprovado.");
						
						ler.close();
						
		}	
	}
}

