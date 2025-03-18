//05) Faça um programa que verifique se um número é impar.

import java.io.*;
import java.util.Scanner;

public class ex5 {
    public static void main(String args[]) {
        /* cria mecanismo para fazer a leitura dos dados pelo console */
        Scanner entrada = new Scanner(System.in);
        /* Declare aqui as variáveis necessárias */
        int n1;
        /* Coloque aqui as instruções para leitura dos dados */
        try {
            System.out.println("Digite um numero para saber se ele é impar");
            n1 = entrada.nextInt();

            if(n1 % 2 != 0){
                System.out.println("O numero é impar");
            } else {
                System.out.println("O numero é par");
            }
            
        } catch (Exception e) {
            System.out.println("Ocorreu algum erro!");
        }
    }
}