package Bolos;

import java.util.Scanner;

public class Bolo15 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entre com um número real não negativo: "); // vai digitar no terminal Entre com um número real não negativo: (numero) o usuario
            double numero = scanner.nextDouble(); // função double numero = resultado Escaneia o próximo TOKEN de um input e retorna como double.

            if (numero >= 0) { // maior igual a 0.
                double raizQuadrada = Math.sqrt(numero); // função double raiz quadrada = (numero)
                System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada + "."); // a raiz quadrada de (numero) é a raiz quadrada.
            } else {
                System.out.println("O número é negativo."); // digita no terminal O número não é não negativo quando o resultado do terminal for (numero negativo).
            }
        }
    }
}
