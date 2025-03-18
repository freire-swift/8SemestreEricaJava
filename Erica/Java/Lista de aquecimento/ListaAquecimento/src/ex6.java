// 06) Faça um programa que receba 3 valores que representarão os lados de um 
//triângulo e verifique se os valores formam um triângulo e classifique esse triângulo como:
// - eqüilátero (3 lados iguais);
// - isósceles (2 lados iguais);
// - escaleno (3 lados diferentes).
// Lembre-se que para formar um triângulo:
// - nenhum dos lados pode ser igual a zero;
// - um lado não pode ser maior do que a soma dos outros dois;

import java.io.*;
import java.util.Scanner;

public class ex6 {
    public static void main(String args[]) {
        /* cria mecanismo para fazer a leitura dos dados pelo console */
        Scanner entrada = new Scanner(System.in);
        /* Declare aqui as variáveis necessárias */
        Double n1, n2, n3;
        String tipo;
        /* Coloque aqui as instruções para leitura dos dados */
        try {
            System.out.println("Digite o tamanho dos 3 lados do triangulo para analise");
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            n3 = entrada.nextDouble();

            //verificar se é triangulo
            if(n1 > 0 && n2 > 0 && n3 > 0){
                if(n1 < n2 + n3 && n2 < n1 + n2 && n3 < n1 + n2){
                    if(n1 == n2 && n1 == n3){
                        tipo = "equilatero";
                    } else if(n1 == n2 || n1 == n3){
                        tipo = "isósceles";
                    } else {
                        tipo = "escaleno";
                    }
                    System.out.println("De acordo com o valor dos dados a classifição é:");
                    System.out.printf("Triângulo %s", tipo);
                } else {
                System.out.println("De acordo com o tamanho dos lados, não é um triângulo");
                }
            } else {
                System.out.println("De acordo com o tamanho dos lados, não é um triângulo");
            }
            
        } catch (Exception e) {
            System.out.println("Ocorreu algum erro!");
        }
    }
}