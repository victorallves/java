
public class TesteTributavel {

	public static void main(String[] args) {
		Conta_Corrente cc = new Conta_Corrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculaImposto imposto = new CalculaImposto();
		
		imposto.registra(cc);
		imposto.registra(seguro);
		
		System.out.println(imposto.getTotalImposto());
		
	}
}
