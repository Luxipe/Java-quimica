package Bolos;

import java.util.Scanner;

public class Bolo5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Configuração Eletrônica: "); // vai falar no terminal a configuração eletronica pro usuario colocar.
            String electronConfig = input.nextLine(); // função do eletronconfig

            // vai Dividir a configuração em subníveis usando espaços como delimitador.
            String[] sublevels = electronConfig.split(" ");

            // vai Obter o último subnível da camada de valencia.
            String valenceSublevel = sublevels[sublevels.length - 1];

            // vai Contar o número de elétrons na camada de valência 
            int valenceElectrons = 0; // valenceEletroncs vai ser 0
            for (char c : valenceSublevel.toCharArray()) {
                if (Character.isDigit(c)) {
                    valenceElectrons += Character.getNumericValue(c); // função pra gerar um valor.
                }
            }

            System.out.println("O átomo possui " + valenceElectrons + " elétrons na camada de valência."); // vai falar quantos tem de atomo e eletrons na camada de valencia.
        }
    }
}
