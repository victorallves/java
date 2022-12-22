package livro;

public class ex6 {

	public static void main(String[] args) {
		
        System.out.println("Algoritimo Para fazer um bolo simples");
		
		System.out.println("---------------------------------");
		
		boolean roupaBranca = false;
		
		boolean temBatedeira = true;
		
		System.out.println("1- Pegar os ingredientes");
		
		if(roupaBranca) {
			System.out.println("2- Colocar o avental");
		}else {
			System.out.println("2- Não é necessario colocar o avental");
		}if(temBatedeira) {
			System.out.println("3- bater na batedeira");
		}else {
			System.out.println("3- Bater os ingredientes a mão");
		}
		
		System.out.println("4- colocar a massa na forma \n5- colocar a forma no forno \n6- aguardar o tempo necessario \n7- retirar o bolo");

		System.out.println("---------------------------------");
	}

}
