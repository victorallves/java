
public class TesteSaqueNegativo {

	public static void main(String[] args) {
		
		Conta teste = new Conta();
		
		teste.deposita(300);
		
		teste.saca(301);

		System.out.println(teste.getSaldo());

	}

}
