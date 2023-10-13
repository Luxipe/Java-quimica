package; Bolos;

import java.util.Scanner;

public class Bolo1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Número de carbonos: "); // vai ser os numeros de carbonos
            int carbons = input.nextInt();  // função do carbonos
            int hydrogens = carbons * 2 + 2; // função do hidrogenios
            System.out.println("A cadeia possui " + hydrogens + " hidrogênios."); // usuario vai poder falar quantos carbonos a cadeia vai ter.
        }
    }
}