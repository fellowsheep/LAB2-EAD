
/**
 * Exceção customizada lançada quando ocorre uma tentativa de remoção
 * ou acesso em uma estrutura de dados que já está vazia.
 * * Na lista estática, isso ocorre ao chamar o método remove() 
 * quando numElements == 0.
 */
public class UnderflowException extends RuntimeException {
	
	/**
	 * Constrói a exceção repassando a mensagem "Underflow!"
	 * para a superclasse RuntimeException.
	 */
	public UnderflowException() {
		super("Underflow!");
	}

}