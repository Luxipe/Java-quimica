package; Bolos;

        import java.util.Scanner;
        
        public class Bolo10 {
        public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
                // vai Solicitar a tensão pro usuário.
                System.out.print("Tensão (V): ");
                double tensao = input.nextDouble(); // função da tensão
   
                // vai Solicitar a resistência pro usuário.
                System.out.print("Resistência (ohms): ");
                double resistencia = input.nextDouble(); // função da resistencia
   
                // Calcula a potência dissipada.
                double potencia = (Math.pow(tensao, 2)) / resistencia;
   
                System.out.println("A potência dissipada é " + potencia + " watts (W).");
            }
        }
    }