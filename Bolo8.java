package Bolos;

import java.util.Scanner;

public class Bolo8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // vai Solicitar a distância percorrida pro usuário.
            System.out.print("Distância percorrida (metros): "); // vai digitar a distancia percorrida pro usuario.
            double distancia = input.nextDouble(); // função da distancia

            // vai Solicitar o tempo gasto pro usuário.
            System.out.print("Tempo gasto (segundos): "); // vai falar pro usuario colocar o tempo gasto(segundos)
            double tempo = input.nextDouble(); // função do tempo

            // vai Calcular a velocidade média.
            double velocidadeMedia = distancia / tempo; // função pra calcular a velocidade média

            System.out.println("A velocidade média é " + velocidadeMedia + " m/s.");  // vai falar o total da velocidade em m/s.
        }
    }
}
