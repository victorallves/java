package teste;

import java.util.ArrayList;

public class arrayLista {

	public static void main(String[] args) {
	
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Java");
		nomes.add("Ruby");
		nomes.add("MySql");
		nomes.add("JavaScript");
	
		nomes.remove(3);

		System.out.println(nomes);

		if(nomes.contains("Java")) {
			System.out.println("Java foi encontrado");
		}else {
			System.out.println("Este elemento não está na lista");
		}

		System.out.println(nomes.size());
		
	}

}




