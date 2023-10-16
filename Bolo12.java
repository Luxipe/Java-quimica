package Bolos;

import java.util.Scanner;

public class Bolo12 {
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entre com a massa do objeto em kg: "); // digita no terminal entre a massa do objeto em kg pro usuario fazer
            double massa = scanner.nextDouble();// uma função double massa que o resultado Escaneia o próximo Token de um input e retorna como double.
            System.out.print("Entre com a aceleração gravitacional do planeta em m/s²: "); // digita no terminal: entre com a aceleração gravitacional do planeta em m/s² pro usuario fazer
            double aceleracaoPlaneta = scanner.nextDouble(); // uma função double aceleracaoPlaneta que o resultado Escaneia o próximo Token de um input e retorna como double.

            double peso = massa * aceleracaoPlaneta;  // uma função double peso. que faz ser massa + aceleraçãoPlaneta
            System.out.println("O peso do objeto no planeta é " + peso + " N (newtons)."); // digita no terminal o resultado final o peso do objeto no planeta = Numero De (Newtons).
        }
    }
}
