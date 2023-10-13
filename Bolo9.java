package; Bolos;

    import java.util.Scanner;
    
    public class Bolo9 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // vai Solicitar a tensão pro usuário.
            System.out.print("Tensão (V): ");
            double tensao = input.nextDouble(); // função da tensão.

            // vai Solicitar a corrente ao usuário.
            System.out.print("Corrente (A): ");
            double corrente = input.nextDouble(); // função da corrente

            // vai Calcular a resistência elétrica.
            double resistencia = tensao / corrente;

            System.out.println("A resistência é " + resistencia + " ohms."); // vai mostrar a resistencia total, dependendo do usuario colocar.
        }
    }
}