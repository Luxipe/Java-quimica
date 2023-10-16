package Bolos;

import java.util.Scanner;

public class Bolo13 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entre com o comprimento da aresta do cubo em cm: "); //digita no terminal Entre com o comprimento da aresta do cubo em cm pro usuario escolher os numeros
            double aresta = scanner.nextDouble(); // função do double aresta o resultado Escaneia o próximo TOKEN de um input e retorna como double.

            double volume = aresta * aresta * aresta; // função do double volume resultado aresta + aresta + aresta
            System.out.println("O volume do cubo é " + volume + " cm³.");  // digita no terminal o volume do cubo é (numero de cm³) que o usuario escolher
        }
    }
}
