package Bolos;

import java.util.Scanner;

public class Bolo16 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entre com um número real: "); // o usuario vai colocar um número real.
            double numero = scanner.nextDouble(); // uma função double numero = Escaneia o próximo TOKEN de um input e retorna como double

            double valorAbsoluto = Math.abs(numero); // função double valorAbsoluto = Retorna o valor absoluto de um número (numero).
            System.out.println("O valor absoluto de " + numero + " é " + valorAbsoluto + ".");// o resultado final vai falar pro usuario o valor Absoluto do numero que ele escolher.
        }
    }
}
