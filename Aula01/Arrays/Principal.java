public class Principal {
    public static void main(String[] args) {
        // Instanciação do objeto para acessar os métodos 
        ExerciciosArrays ea = new ExerciciosArrays();

        // Exercicio 1
        System.out.println("EXERCÍCIO 1\n");

        System.out.println("--- Resultado Exercício 1a ---");
        imprimirMatriz(ea.exercicio1a());

        System.out.println("\n--- Resultado Exercício 1b ---");
        imprimirMatriz(ea.exercicio1b());

        System.out.println("\n--- Resultado Exercício 1c ---");
        imprimirMatriz(ea.exercicio1c());

        System.out.println("\n--- Resultado Exercício 1d ---");
        imprimirMatriz(ea.exercicio1d());

        System.out.println("--------------------------------------------------");

        // Exercicio 2
        System.out.println("EXERCÍCIO 2\n");
        imprimirMatriz(ea.exercicio2());

        // Extra! Array 3D feito em aula
        imprimirArray3D(ea.exemploArray3D());
    }

    /**
     * Método auxiliar para imprimir as matrizes no console de forma organizada
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Formata a saída para alinhar os números
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }
    }


    public static void imprimirArray3D(int[][][] array3D) {
        // Vamos aqui, para cada dimensão i, imprimir a "matriz [j][k]"
        for (int i = 0; i < array3D.length; i++) {
            System.out.printf("Dimensão [%d]:\n",i);
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    // Formata a saída para alinhar os números
                    System.out.printf("%3d ", array3D[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }
}
