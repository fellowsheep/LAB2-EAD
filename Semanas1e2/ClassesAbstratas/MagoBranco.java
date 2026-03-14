package Semanas1e2.ClassesAbstratas;

public class MagoBranco extends Mago {

    public MagoBranco(String nome, int poder, int idade) {
        // 'super' chama o construtor da classe pai (Mago)
        super(nome, poder, idade, 1); // 1 representa a escola de cura, por exemplo
    }

    // Implementação obrigatória do método abstrato
    @Override
    public void invocarMagia() {
        System.out.println(nome + " invoca uma luz ofuscante!");
    }

    // Método específico desta classe
    public void lancarCura() {
        System.out.println(nome + " curou os aliados!");
    }
}
