package; Bolos;

    import java.util.Scanner;
    
    public class Bolo11 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // vai Solicitar a massa do objeto ao usuário.
            System.out.print("Massa do objeto (kg): ");
            double massa = input.nextDouble(); // função da massa

            // vai Solicitar a aceleração desejada ao usuário.
            System.out.print("Aceleração desejada (m/s²): ");
            double aceleracao = input.nextDouble(); // função da aceleracao

            // vai Calcular a força necessária.
            double forca = massa * aceleracao;

            System.out.println("A força necessária é de " + forca + " newtons (N).");
        }
    }
}