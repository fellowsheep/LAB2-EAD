package Semanas1e2.ClassesAbstratas;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Início do Teste de Magos ---");

        // 1. TENTATIVA DE INSTANCIAR CLASSE ABSTRATA
        // Se você descomentar a linha abaixo, o Java dará um erro de compilação.
        // Mago magoGenerico = new Mago("Alvo", 50, 100, 0); 
        // EXPLICAÇÃO: Classes abstratas não podem criar objetos diretamente.

        // 2. CRIANDO OBJETOS DAS SUBCLASSES (CLASSES CONCRETAS)
        MagoBranco gandalf = new MagoBranco("Gandalf, o Branco", 95, 2000);
        MagoCinza saruman = new MagoCinza("Saruman, o Curandeiro", 80, 1500);

        // 3. TESTANDO MÉTODOS HERDADOS (REUSO DE CÓDIGO)
        // Ambos herdaram 'andar' e 'falar' da classe Mago.
        gandalf.andar();
        saruman.falar();

        System.out.println("---------------------------------");

        // 4. TESTANDO O POLIMORFISMO
        // O método invocarMagia() foi definido como abstrato no pai e
        // implementado de formas diferentes em cada filho.
        gandalf.invocarMagia(); // Resultado: Luz ofuscante
        saruman.invocarMagia(); // Resultado: Cortina de fumaça

        System.out.println("---------------------------------");

        // 5. TESTANDO MÉTODOS ESPECÍFICOS
        // Estes métodos só existem em suas respectivas subclasses.
        gandalf.lancarCura();
        saruman.prepararPocao();

        System.out.println("--- Fim do Teste ---");
    }
}
