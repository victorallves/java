package teste;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Java");
		nomes.add("Ruby");
		nomes.add("MySql");
		nomes.add("JavaScript");
		
		
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
			String atual = it.next();
			System.out.println(atual);
			
			
			
			//hasNext: retorna um booleano indicando se ainda há elementos a serem percorridos por esse iterador;
			//next: pula para o próximo elemento, devolvendo-o;
			//remove: remove o elemento atual da coleção.

	   }

   }
	
}
