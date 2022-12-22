package teste;

import java.util.*;

public class map {

	public static void main(String[] args) {

		String palavra = "VICTOR AUGUSTO ADRIANO ALVES";

		contaCaracter(palavra);

	}

	private static void contaCaracter(String palavra) {

		HashMap<Character, Integer> Mapa = new HashMap<Character, Integer>();

		char[] palavraChar = palavra.toCharArray();

		for (char i : palavraChar) {

			if (Mapa.containsKey(i)) {
				Mapa.put(i, Mapa.get(i) + 1);

			} else {
				Mapa.put(i, 1);
			}

		}

		Mapa.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});

	}
}
