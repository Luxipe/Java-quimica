package Bolos;
import java.util.Scanner;
public class Bolo3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Massa (g): "); // pro usuario colocar no terminal a massa (g)
            double mass = input.nextDouble(); // função da massa
            System.out.print("Massa Molar (g/mol): "); // pro usuario colocar no terminal a massa molar (g/mol)
            double molarMass = input.nextDouble();  // função da molarMass
            double mols = mass / molarMass;   // função do mols
            System.out.println("A quantidade de mols é " + mols); // vai colocar no terminal a quantidade de mols que o usuario for colocar no terminal.
        }
    }
}