package Semanas1e2.Exceptions;
import java.util.Scanner;

public class TesteExcecoesRPG {
    public static void main(String[] args) {
        // Matriz 2x2 representando o inventário (Linha 0: Armas, Linha 1: Poções)
        String[][] inventario = {
            {"Espada de Ferro", "Arco Curto"},
            {"Poção de Vida", "Antídoto"}
        };

        Scanner leitor = new Scanner(System.in);

        System.out.println("--- 🛡️ BEM-VINDO AO SISTEMA DE INVENTÁRIO ---");
        System.out.println("Temos categorias 0 (Armas) e 1 (Itens) com 2 slots cada.");

        try {
            System.out.print("\nEscolha a categoria (linha): ");
            int linha = leitor.nextInt();

            System.out.print("Escolha o slot (coluna): ");
            int coluna = leitor.nextInt();

            // Ação arriscada: Acessar índice que pode não existir
            String item = inventario[linha][coluna];
            System.out.println("✅ Sucesso! Você equipou: " + item);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Captura o erro de índice fora dos limites do array
            System.err.println("\n❌ ERRO DE EXPLORAÇÃO: Esse slot não existe na sua mochila!");
            System.out.println("Detalhe técnico: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {
            // Captura erro se o usuário digitar uma letra em vez de número
            System.err.println("\n❌ ERRO DE COMANDO: Você deve digitar números inteiros para os índices!");

        } finally {
            // Sempre executado, como limpar a memória ou fechar o Scanner
            System.out.println("\n✨ O sistema de inventário foi fechado com segurança.");
            leitor.close();
        }

        System.out.println("--- FIM DA EXECUÇÃO ---");
    }
}