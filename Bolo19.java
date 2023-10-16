package Bolos;

import java.util.Scanner;

public class Bolo19 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entre com a configuração eletrônica do átomo: "); // Entre com aconfiguração eletrônica do átomo o usuario vai colocar  o (numero).
            String configuracaoEletronica = scanner.nextLine();

            int posicaoUltimoSubnivel = configuracaoEletronica.lastIndexOf(" ");
            String ultimoSubnivel = configuracaoEletronica.substring(posicaoUltimoSubnivel + 1);

            System.out.println("O último subnível preenchido é " + ultimoSubnivel); //o número que o usuario escolheu no terminal vai mostrar O ultimo subnivel preenchido é (numero).
        }
    }
}
