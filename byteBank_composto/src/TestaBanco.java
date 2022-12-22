public class TestaBanco {

	public static void main(String[] args) {
	
		Cliente victor = new Cliente();
		
		victor.nome = "Victor Augusto";
		victor.cpf = "222.222.222-22";            
		victor.profissao = "Desenvolvedor";
		
		Conta contaDoVictor = new Conta();
		
		contaDoVictor.titular = victor;
		
		System.out.println(contaDoVictor.titular.profissao);
	}

}
