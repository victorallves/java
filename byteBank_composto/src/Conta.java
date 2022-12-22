public class Conta {
	private double saldo;
	int agencia;      // atributos
	int numeroConta;
	Cliente titular; // referencia para outa classe do tipo cliente.

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
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
}