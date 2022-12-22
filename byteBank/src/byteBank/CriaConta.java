package byteBank;

public class CriaConta {

	public static void main(String[] args) {
	
		Conta contaDoMichels = new Conta();
		contaDoMichels.saldo = 200;
		
		Conta contaDoJackson = new Conta();
		contaDoJackson.saldo = 500;
		
		Conta contaDoVictor = new Conta();
		contaDoVictor.saldo = 200;
		
		contaDoVictor.trasfere(200, contaDoJackson);
	
	
		//System.out.println(contaDoVictor.saldo);
		
	}
}
