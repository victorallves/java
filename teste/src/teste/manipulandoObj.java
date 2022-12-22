package teste;

public class manipulandoObj {

	public static void main(String[] args) {
		
		Cliente[] clientes = new Cliente[2]; // instanciando a classe Cliente 
		
		for(int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente(); // criando objeto 
		}
		
		clientes[0].nome = "Victor ";  // poupulando a primeira  objeto 
		clientes[0].idade = 19;
		
		clientes[1].nome = "Daniel ";  // poupulando a segunda posição do objeto 
		clientes[1].idade = 25;
	
		
		for(Cliente c : clientes) {
			System.out.println(c.nome + c.idade); // forEach para a leitura.
		}
		
	    
	}
		
}



