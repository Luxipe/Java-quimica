package; Bolos;

import java.util.Scanner;

public class Bolo2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Número de carbonos: "); // vai digitar o numeros de carbonos no terminal pro usuario colocar
            int carbons = input.nextInt(); // função do carbonos
            int secondaryCarbons = carbons - 2; // função para secundaria do carbonos. por exemplo -2.
            int tertiaryCarbons = 0; // função para terciario do carbonos, por exemplo 0.
            if (carbons > 4) { // menor
                tertiaryCarbons = 1; // terciario do carbono vai ser 1
            }
             System.out.println("A cadeia possui " + secondaryCarbons + " carbonos secundários e " + tertiaryCarbons + " carbono terciário."); // função para mostrar no terminal carbonos dependendo da cadeia que o usuario colocar.
        }
    }
}