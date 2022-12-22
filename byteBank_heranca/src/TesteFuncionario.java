
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
	
		Gerente gerente = new Gerente();
		Administrador adm = new Administrador();
		Autenticavel c1 = new Cliente();
		
		adm.setSenha(444);
		c1.setSenha(222);
		gerente.setSenha(123);
		
		gerente.setCpf("123-321-2");
		gerente.setNome("victor");
		gerente.setSalario(3500.0);
		
		System.out.println(c1.autentica(444));
		
		System.out.println("Olá: " + gerente.getNome());
		System.out.println("Sua bonificação é de: " + gerente.getBonificaco());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salario: " + gerente.getSalario());
		
	}
}
