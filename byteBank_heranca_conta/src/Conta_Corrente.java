
public class Conta_Corrente extends Conta implements Tributavel {

	
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.2;
	}
	
	public Conta_Corrente(int agencia, int numeroConta) {
		super(agencia,numeroConta);
	}
	
	@Override
	public void saca(double valor) {
		if (getSaldo() >= valor && valor > 0) {
			valor = valor * 1.1;
			System.out.println("voce sacou / transferiu " + valor + " reais");
		} else {
			System.out.println("voce não tem dinheiro o suficiente!");
		}
		
	}
	
	@Override
	public void deposita(double valor) {
		super.deposita(valor);
	}


	
}
