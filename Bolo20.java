package Bolos;

import java.util.Scanner;

public class Bolo20 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a configuração eletrônica: ");
            String configuracaoEletronica = scanner.nextLine();

            int totalEletrons = 0;
            // Percorre cada caractere na configuração eletrônica para contar os dígitos.
            for (int i = 0; i < configuracaoEletronica.length(); i++) {
                if (Character.isDigit(configuracaoEletronica.charAt(i))) {
                    // Se o caractere for um dígito, adiciona seu valor à contagem de elétrons.
                    totalEletrons += Character.getNumericValue(configuracaoEletronica.charAt(i));
                }
            }

            // Exibe o resultado, informando o número total de elétrons.
            System.out.println("O átomo possui " + totalEletrons + " elétrons.");
        }
    }
}
