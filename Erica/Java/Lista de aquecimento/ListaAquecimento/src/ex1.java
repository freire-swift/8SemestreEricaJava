//01) Faça um programa que receba um valor que é o valor pago, 
//um segundo valor que é o preço do produto e retorne o troco a ser dado.
import java.io.*;
import java.util.Scanner;

public class ex1 {
    public static void main(String args[]) {
        /* cria mecanismo para fazer a leitura dos dados pelo console */ 
        Scanner entrada = new Scanner(System.in);
        /* Declare aqui as variáveis necessárias */
        int n1, n2, tot;
        /* Coloque aqui as instruções para leitura dos dados */
        try {
            System.out.print("Entre com o valor a ser pago e o preço do produto:\n");
            n1 = entrada.nextInt(); // entrada.nextFloat() para reais
            n2 = entrada.nextInt();
            // entrada.nextLine() para strings
            /*
             * Coloque aqui o código para resolver o problema. 
             * Novas variáveis podem ser criadas, se necessário.
             */ tot = n1 - n2;
            /* Coloque aqui o código para mostrar os resultados */
            String saida = "Resposta:\n";
            saida = saida + n1 + " - " + n2 + " = " + tot;
            saida = saida + "\nFim.";
            System.out.print(saida);
        } 
        catch (Exception e) {
            System.out.println("Ocorreu algum erro!");
        }
    }
}