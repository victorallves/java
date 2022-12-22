public abstract class Conta {
	private double saldo;
	private int agencia;      // atributos
	private int numeroConta;
	private Cliente titular; // referencia para outa classe do tipo cliente.

	// usamos o this dentro do metodo para acessar o atributo.
	
	public Conta(int agencia, int numeroConta){
		this.agencia = agencia;                        // metodo construtor da classe, já cria o objeto com dois parametros.
		this.numeroConta = numeroConta;				  // metodos construtore não são herdados nas classes filhas.
	}
	
	public void deposita(double valor) {   // metodos
		if(valor >= 0 && valor <= 5000) {
			this.saldo += valor;
			System.out.println(numeroConta + ": seu saldo agora é de: " + saldo);
		}else {
			System.out.println("Não foi possivel fazer a sua transação, por favor vá a agencia mais proxima.");
		}
	}

	public void saca(double valor) {
		if (saldo >= valor && valor > 0) {
			this.saldo -= valor;
			System.out.println("voce sacou / transferiu " + valor + " reais");
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
	
	
	public double getSaldo() {     // "get" metodo que acessa o atributo privado, apenas para a leitura
		return this.saldo;
	}							   // "set" metodo usado para atribuir um novo valor ao atributo privado
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
}