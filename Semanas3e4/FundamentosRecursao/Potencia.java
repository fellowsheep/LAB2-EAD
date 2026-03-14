package Semanas3e4.FundamentosRecursao;
public class Potencia {
    
    public static void main(String[] args) {

        int r = potencia(3,4);
        System.out.println("Resultado: " + r);


    }

    public static int potencia(int x, int y) {
        // Caso base
        if (y == 0) return 1;
        // Caso geral: chamada recursiva
        else return (x * potencia(x,y-1));
    }
    
}
