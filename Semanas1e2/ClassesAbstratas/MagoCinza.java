package Semanas1e2.ClassesAbstratas;

public class MagoCinza extends Mago {

    public MagoCinza(String nome, int poder, int idade) {
        super(nome, poder, idade, 2); // 2 representa a escola de poções
    }

    @Override
    public void invocarMagia() {
        System.out.println(nome + " cria uma cortina de fumaça cinzenta!");
    }

    // Método específico desta classe
    public void prepararPocao() {
        System.out.println(nome + " está misturando ingredientes raros no caldeirão.");
    }
}
