//05) Faça um programa que verifique se um número é impar.

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
            System.out.print("");
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            
        } catch (Exception e) {
            System.out.println("Ocorreu algum erro!");
        }
    }
}