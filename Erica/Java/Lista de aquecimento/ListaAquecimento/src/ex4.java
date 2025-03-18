//04) Faça um programa que receba 4 valores e retorne o menor entre eles.

import java.io.*;
import java.util.Scanner;

public class ex4 {
    public static void main(String args[]) {
        /* cria mecanismo para fazer a leitura dos dados pelo console */
        Scanner entrada = new Scanner(System.in);
        /* Declare aqui as variáveis necessárias */
        Double n1, n2, n3, n4, maior = 0.0;
        /* Coloque aqui as instruções para leitura dos dados */
        try {
            System.out.print("Digite 4 valores\n");
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            n3 = entrada.nextDouble();
            n4 = entrada.nextDouble();

            // Coloque aqui o código para resolver o problema.

            if (n1 >= n2 && n1 >= n3 && n1 >= n4) {
                maior = n1;
            } if (n2 >= n1 && n2 >= n3 && n2 >= n4) {
                maior = n2;
            } if (n3 >= n1 && n3 >= n3 && n3 >= n4) {
                maior = n3;
            } if (n4 >= n1 && n4 >= n3 && n4 >= n4) {
                maior = n4;
            }
            System.out.printf("O maior valor é %.2f\n", maior);
        } catch (Exception e) {
            System.out.println("Ocorreu algum erro!");
        }
    }
}