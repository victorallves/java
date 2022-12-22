public class TestaGetSet {

	public static void main(String[] args) {
			
		Conta contaDoVictor = new Conta(1500,3222343);
		
		System.out.println("Numero da Agencia: "+ contaDoVictor.getAgencia());
		System.out.println("Numero da Conta: " + contaDoVictor.getNumeroConta());
		
		Cliente victor = new Cliente(); // cria o cliente
		
		contaDoVictor.setTitular(victor); // referencia para o cliente 
		
		victor.setNome("Victor"); // seta o nome do cliente
		
		System.out.println("Nome do Titular: " + contaDoVictor.getTitular().getNome());
		
		contaDoVictor.deposita(200);
		
		contaDoVictor.saca(150);
		
		System.out.println("Seu saldo agora é de: " + contaDoVictor.getSaldo());
	  
	}

}
