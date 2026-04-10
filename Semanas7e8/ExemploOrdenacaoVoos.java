package Semanas7e8;

/**
 * Classe que modela o nosso objeto de estudo: O Voo.
 */
class Voo {
    String destino;
    int horario; // Representaremos a hora como um inteiro (ex: 15, 20, 12) para facilitar

    public Voo(String destino, int horario) {
        this.destino = destino;
        this.horario = horario;
    }

    // Método reescrito para facilitar a visualização quando formos imprimir o array
    @Override
    public String toString() {
        return "[" + destino + " | " + horario + "h]";
    }
}

/**
 * Classe principal que demonstra a importância da ordenação estável.
 */
public class ExemploOrdenacaoVoos {

    public static void main(String[] args) {
        // 1. Criando o array original (exatamente como nas tabelas da aula)
        Voo[] voos = {
            new Voo("SP", 15),
            new Voo("RJ", 20),
            new Voo("RS", 12),
            new Voo("SP", 12),
            new Voo("SP", 21)
        };

        System.out.println("--- ESTADO ORIGINAL ---");
        imprimirArray(voos);

        // REGRA DE OURO DA ORDENAÇÃO MÚLTIPLA:
        // Primeiro ordenamos pelo critério de DESEMPATE (Secundário).
        // Depois ordenamos pelo critério PRINCIPAL usando um método ESTÁVEL.

        // PASSO 1: Ordenar pelo critério SECUNDÁRIO (Horário)
        bubbleSortHorario(voos);
        System.out.println("\n--- APÓS PASSO 1 (Ordenado por Horário) ---");
        imprimirArray(voos);

        // PASSO 2: Ordenar pelo critério PRINCIPAL (Destino)
        // AQUI ESTÁ O SEGREDO: Este algoritmo DEVE ser estável (Ex: Inserção Direta),
        // caso contrário, a ordenação dos horários feita acima será destruída!
        insertionSortDestino(voos);
        System.out.println("\n--- APÓS PASSO 2 (Ordenado por Destino - ESTÁVEL) ---");
        imprimirArray(voos);
    }

    /**
     * Algoritmo: Método da Bolha (Bubble Sort) adaptado para OO.
     * Objetivo: Ordenar os voos pelo Horário (Atributo numérico).
     */
    public static void bubbleSortHorario(Voo[] a) {
        int i = a.length - 1;
        
        // O laço externo controla até onde precisamos varrer o array
        while (i > 0) {
            // O laço interno compara pares adjacentes
            for (int j = 0; j < i; j++) {
                // Se o horário do voo atual for maior que o do próximo, troca!
                if (a[j].horario > a[j + 1].horario) {
                    Voo aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
            i--; // Diminui o limite, pois o maior já "flutuou" para o final do array
        }
    }

    /**
     * Algoritmo: Inserção Direta (Insertion Sort) adaptado para OO. -> É UM ALGORITMO ESTÁVEL!
     * Objetivo: Ordenar os voos pelo Destino (Atributo String).
     */
    public static void insertionSortDestino(Voo[] a) {
        // Começamos do índice 1, assumindo que a posição 0 já é um sub-vetor ordenado
        for (int i = 1; i < a.length; i++) {
            int j = i;
            Voo b = a[i]; // 'b' é o voo que queremos inserir na posição correta do sub-vetor

            // Como 'destino' é String, usamos o compareTo() para checar a ordem alfabética.
            // a[j-1].destino.compareTo(b.destino) > 0 significa que a[j-1] vem DEPOIS de 'b' no alfabeto.
            // O while empurra os maiores para a direita até achar o "buraco" certo.
            while ((j > 0 && (a[j - 1].destino.compareTo(b.destino) > 0))) {
                a[j] = a[j - 1];
                j--;
            }
            // Insere o voo no "buraco" encontrado
            a[j] = b;
        }
    }

    /**
     * Método auxiliar apenas para imprimir o array no console.
     */
    public static void imprimirArray(Voo[] a) {
        for (Voo v : a) {
            System.out.print(v.toString() + " ");
        }
        System.out.println();
    }
}