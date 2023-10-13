package; Bolos;

import java.util.Scanner;
import java.lang.Math;

public class Bolo7{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Solicita a altura da queda pro usuário.
            System.out.print("Altura (metros): "); // vai falar pro usuario colocar a altura(metros).
            double altura = input.nextDouble(); // função da altura.

            // Aceleração devida à gravidade na Terra , vai ser 9.8
            double aceleracaoGravidade = 9.8;

            // vai Calcular a velocidade final
            double velocidadeFinal = Math.sqrt(2 * aceleracaoGravidade * altura);

            System.out.println("A velocidade final é " + velocidadeFinal + " m/s."); // vai mostrar a velocidade final pro usuario.
        }
    }
}