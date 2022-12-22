package livro;

public class ex8 {

	public static void main(String[] args) {
		
		System.out.println("Algoritimo para fazer uma prova");
		
		System.out.println("---------------------------------");

		System.out.println("1- Pegar a prova \n2- Pegar a caneta");
		
		int houverQuestaoBranco = 0;
		
		int tempoNaoTerminou = 0;
		
		boolean souberQuestao = false;
		
		while((houverQuestaoBranco < 1) && (tempoNaoTerminou < 1)) {
			houverQuestaoBranco++;
			tempoNaoTerminou++;
			
			if(souberQuestao) {
				System.out.println("3- Responda a questão");
			}else {
				System.out.println("3- pular para a proxima questão");
			}
			
			System.out.println("4- entregue a prova");
			
			System.out.println("---------------------------------");
			
		}
	}

}
