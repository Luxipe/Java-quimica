package Bolos;

import java.util.Scanner;

public class Bolo17 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entre com o número de carbonos na cadeia carbônica: "); //digita no terminal Entre com o número de carbonos na cadeia carbônica: (numero).
            int numCarbonos = scanner.nextInt(); // função do int numCarbonos , scanner.nextInt() = é usado para escanear ou analisar a entrada.

            int numCarbonosPrimarios = numCarbonos - 2; // Int numCarbonosPrimarios = numCarbonos = vai ser -2
            System.out.println("A cadeia possui " + numCarbonosPrimarios + " carbonos primários."); // o resultado final vai mostrar a cadeia (numero) carbonosPrimários.
        }
    }
}
