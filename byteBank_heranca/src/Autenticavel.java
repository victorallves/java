/* contrato Autenticacao
 *  
 *  quem Implementar essa interface
 *  
 *  precisa implementar

 *  setSenha e autentica
*/

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica (int senha);

}
