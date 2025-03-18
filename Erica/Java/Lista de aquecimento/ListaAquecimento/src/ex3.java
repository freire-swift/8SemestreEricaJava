//03) Faça um programa que receba 2 valores e retorne o maior entre eles.

import java.io.*;
import java.util.Scanner;

public class ex3 {
    public static void main(String args[]) {
        /* cria mecanismo para fazer a leitura dos dados pelo console */
        Scanner entrada = new Scanner(System.in);
        /* Declare aqui as variáveis necessárias */
        Double n1, n2, tot, maior;
        /* Coloque aqui as instruções para leitura dos dados */
        try {
            System.out.print("Digite 2 valores\n");
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
        
            //Coloque aqui o código para resolver o problema.
            
            if(n1 > n2){
                maior = n1;
                System.out.printf("O maior valor é %.2f\n", maior);
            } if(n2 > n1){
                maior = n2;
                System.out.printf("O maior valor é %.2f\n", maior);
            } else {
                System.out.println("Os valores sào iguais");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu algum erro!");
        }
    }
}