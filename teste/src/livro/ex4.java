package livro;

public class ex4 {

	public static void main(String[] args) {
		
		System.out.println("Algoritimo Para trocar a Lâmpadas");
		
		System.out.println("---------------------------------");

		boolean lampadaForaAlcance = true ;
		boolean lampadaQuente = true;
		
		if(lampadaForaAlcance) {
			System.out.println("1- Pegar escada");
		}
		
		if(lampadaForaAlcance){
			System.out.println("2- pegar a lâmpada");
		}else {
			System.out.println("1- pegar a lâmpada");
		}
		
		if(lampadaQuente) {
			System.out.println("3- Pegar pano");
		}else {
			
		}
		
		if(lampadaQuente) {
			System.out.println("4- tirar lâmpada queimada");
		}else {
			System.out.println("2- tirar lâmpada queimada");
		}
		
		if(lampadaForaAlcance && lampadaQuente) {
			System.out.println("5- colocar a lâmpada boa");
		}else {
			System.out.println("3- colocar a lâmpada boa");
		}
		
		System.out.println("---------------------------------");
	}

}
