package byteBank;

public class Conta {
	double saldo;
	int agencia;      // atributos
	int numeroConta;
	String titular;

	// usamos o this dentro do metodo para acessar o atributo.
	
	public void deposita(double valor) {   // metodos
		if(valor >= 0 && valor <= 5000) {
			this.saldo += valor;
			System.out.println("seu saldo agora é de: " + saldo);
		}else {
			System.out.println("Não foi possivel fazer a sua transação, por favor vá a agencia mais proxima.");
		}
	}

	public void saca(double valor) {
		if (saldo >= valor && valor > 0) {
			this.saldo -= valor;
			System.out.println("foi sacado " + valor + " reais");
		} else {
			System.out.println("voce não tem dinheiro o suficiente!");
		}
	}
	
	public void trasfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
		}else {
			System.out.println("não foi possivel efetuar a sua transação");
		}
	}
}