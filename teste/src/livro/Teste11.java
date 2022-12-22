package livro;

import java.util.Scanner;

public class Teste11 {

	public static void main(String[] args) {
	
		  Scanner ler = new Scanner(System.in);
		  
	        int contador1 = 0;
	        int contador2 = 0;
	        int contador3 = 0;
	        int contador4 = 0;
	    
	        for (int i = 0; i < 5; i++) {
	        	
	        	int n = ler.nextInt();
				
	        	if(n % 2 == 0) {
					contador1++;
				}else if(n % 2 != 0) {
					contador2++;
				}if(n > 0) {
					contador3++;
				}else if(n < 0) {
					contador4++;
				}
			}
	        
	        
	        System.out.println(contador1 + " valor(es) par(es)");
	        System.out.println(contador2 + " valor(es) impar(es)");
	        System.out.println(contador3 + " valor(es) positivo(s)");
	        System.out.println(contador4 + " valor(es) negativo(s)");
	        
	        ler.close();
	        
	}

}
