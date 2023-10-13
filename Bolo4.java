package; Bolos;

import java.util.Scanner;

public class Bolo4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Mols: "); // vai falar pro usuario digitar o Mols.
            double mols = input.nextDouble();
            System.out.print("Massa Molar (g/mol): "); // vai falar pro usuario digitar a massa molar.
            double molarMass = input.nextDouble(); // função da molarMass
            double mass = mols * molarMass; // função para calcular o mols com a molarMass
            System.out.println("A massa é " + mass + "g."); // vai falar quantos o total da massa tem de gramas.
        }
    }
}