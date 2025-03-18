//02) Faça um programa que receba o valor do quilo de um produto e a 
//quantidade de quilos do produto consumida calculando o valor final a ser pago.

import java.io.*;
import java.util.Scanner;

public class ex2 {
    public static void main(String args[]) {
        /* cria mecanismo para fazer a leitura dos dados pelo console */
        Scanner entrada = new Scanner(System.in);
        /* Declare aqui as variáveis necessárias */
        Double n1, n2, tot;
        /* Coloque aqui as instruções para leitura dos dados */
        try {
            System.out.print("Entre com a quantidade consumida e o preço do produto:\n");
            n1 = entrada.nextDouble(); // entrada.nextFloat() para reais
            n2 = entrada.nextDouble();
            // entrada.nextLine() para strings
            /*
             * Coloque aqui o código para resolver o problema.
             * Novas variáveis podem ser criadas, se necessário.
             */ tot = n1 * n2;
            /* Coloque aqui o código para mostrar os resultados */
            String saida = "Resposta:\n";
            saida = saida + n1 + " * " + n2 + " = " + tot;
            saida = saida + "\nFim.";
            System.out.print(saida);
        } catch (Exception e) {
            System.out.println("Ocorreu algum erro!");
        }
    }
}