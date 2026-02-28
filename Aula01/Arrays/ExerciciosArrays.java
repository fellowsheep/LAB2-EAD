import java.util.Random;
import java.util.Scanner;

public class ExerciciosArrays {

    // Exercício 1
    // Exercício 1a: Retorna matriz 3x10 com valores de 0 a 9 em cada linha
    public int[][] exercicio1a() {
        int[][] matriz = new int[3][10];

        //primeiro elemento da primeira linha
        matriz[0][0] = 10;

        System.out.println(matriz.length); //imprime nro elem 1 dim
        System.out.println(matriz[0].length); //imprime nro elem da segunda..

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = j;
            }
        }
        return matriz;
    }

    // Exercício 1b: Retorna matriz 6x10 com quadrados dos índices (0, 1, 4, 9...)
    public int[][] exercicio1b() {
        int[][] matriz = new int[6][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = j * j;
            }
        }
        return matriz;
    }

    // Exercício 1c: Retorna matriz 6x6 onde cada linha contém o número do seu próprio índice
    public int[][] exercicio1c() {
        int[][] matriz = new int[6][6];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i;
            }
        }
        return matriz;
    }

    // Exercício 1d: Retorna matriz 9x6 alternando linhas de -1 e 0
    public int[][] exercicio1d() {
        int[][] matriz = new int[9][6];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    matriz[i][j] = -1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }
    //---------------------------------------------------------------------------
    // Exercicio 2
    public int[][] exercicio2() {
        try (Scanner teclado = new Scanner(System.in)) {
            Random gerador = new Random();

            System.out.println("Digite a quantidade de linhas:");
            int linhas = teclado.nextInt();

            System.out.println("Digite a quantidade de colunas:");
            int colunas = teclado.nextInt();

            int[][] matriz = new int[linhas][colunas];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    // gera um número entre 0 e 99
                    matriz[i][j] = gerador.nextInt(100); 
                }
            }
            return matriz;
        }
    }

    public int[][][] exemploArray3D() {
        int[][][] array3D = new int[3][4][5];

        System.out.println(array3D.length); //imprime nro elem 1 dim
        System.out.println(array3D[0].length); //imprime nro elem da segunda..
        System.out.println(array3D[0][0].length); //imprim nro elem da terceira dim..

        for (int i = 0; i < array3D.length; i++) { // percorre indices 1a dim
            for (int j = 0; j < array3D[i].length; j++) { //percorre indices 2a dim
                for(int k=0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = 0; //inicializa com zeros
                }
            }
        }
        return array3D;
    }


}