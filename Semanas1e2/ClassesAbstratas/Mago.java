package Semanas1e2.ClassesAbstratas;

// A palavra 'abstract' indica que esta classe não pode ser instanciada diretamente
public abstract class Mago {
    // Atributos 'protected' permitem que as classes filhas acessem os dados diretamente
    protected String nome;
    protected int poder;
    protected int idade;
    protected int escolaMagia;

    // Construtor para inicializar os dados comuns a todos os magos
    public Mago(String nome, int poder, int idade, int escolaMagia) {
        this.nome = nome;
        this.poder = poder;
        this.idade = idade;
        this.escolaMagia = escolaMagia;
    }

    // Métodos concretos (com corpo): todos os magos fazem igual
    public void andar() {
        System.out.println(nome + " está caminhando...");
    }

    public void falar() {
        System.out.println(nome + " diz: 'Pelas barbas de Merlin!'");
    }

    // Método ABSTRATO: não tem corpo {}. 
    // Isso obriga cada subclasse a implementar sua própria versão de magia.
    public abstract void invocarMagia();
}
