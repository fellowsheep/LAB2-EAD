/**
 * Exceção customizada lançada quando ocorre uma tentativa de inserção
 * em uma estrutura de dados que já atingiu sua capacidade máxima.
 * * Na lista estática, isso ocorre ao chamar o método insert() 
 * quando a estrutura está cheia (isFull() == true).
 */
public class OverflowException extends RuntimeException {
	
	/**
	 * Constrói a exceção repassando a mensagem "Overflow!"
	 * para a superclasse RuntimeException.
	 */
	public OverflowException() {
		super("Overflow!");
	}

}