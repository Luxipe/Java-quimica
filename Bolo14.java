package Bolos;

import java.util.Scanner;

public class Bolo14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entre com o raio da esfera em cm: "); // digita no terminal o raio da esfera em cm o usuario escolher.
            double raio = scanner.nextDouble(); // função double raio resultado Escaneia o próximo TOKEN de um input e retorna como double

            double areaSuperficie = 4 * Math.PI * raio * raio; // função da areaSuperficie resultado 4 + PI + raio + raio.
            System.out.println("A área da superfície da esfera é aproximadamente " + areaSuperficie + " cm²."); // resultado final A área da superfície da esfera é aproximadamente(numero de cm²) do usuario escolher.
        }
    }
}

