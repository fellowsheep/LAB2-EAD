package Semanas1e2.Exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PrincipalRPG {
    public static void main(String[] args) {
        // Matriz representando o Inventário: [Categoria][Item]
        // Linha 0: Armas | Linha 1: Poções
        String[][] inventario = {
            {"Lâmina de Ébano", "Arco de Faia"},
            {"Poção de Mana", "Elixir de Agilidade"}
        };

        Scanner teclado = new Scanner(System.in);

        System.out.println("--- 🏰 SISTEMA DE GERENCIAMENTO DE AVENTURA ---");
        
        try {
            System.out.print("Selecione a Categoria (0 para Armas, 1 para Poções): ");
            int cat = teclado.nextInt();

            System.out.print("Selecione o Slot do Item (0 ou 1): ");
            int slot = teclado.nextInt();

            // TENTATIVA: Acessar o array com os índices informados
            String itemSelecionado = inventario[cat][slot];
            System.out.println("\n⚔️ Sucesso! Você equipou: " + itemSelecionado);

        } catch (ArrayIndexOutOfBoundsException e) {
            // ESCUDO: Captura erro se o índice for maior que o array (ex: digitar 5)
            System.err.println("\n⚠️ ERRO DE EXPLORAÇÃO: Você tentou acessar um plano dimensional inexistente!");
            System.out.println("Dica do Mestre: Seu inventário só tem 2 categorias e 2 slots por categoria.");

        } catch (InputMismatchException e) {
            // ESCUDO: Captura erro se o usuário digitar letras no lugar de números
            System.err.println("\n⚠️ ERRO DE LÓGICA: O pergaminho só aceita números inteiros!");
            
        } catch (Exception e) {
            // ESCUDO GENÉRICO: Para qualquer outro monstro inesperado
            System.err.println("\n⚠️ ERRO DESCONHECIDO: Um feitiço corrompeu sua ação.");
            
        } finally {
            // DESTINO: Sempre fecha o Scanner, como um ritual de encerramento
            System.out.println("\n✨ O Mestre encerra sua consulta ao inventário.");
            teclado.close();
        }

        System.out.println("--- FIM DO TURNO ---");
    }
}