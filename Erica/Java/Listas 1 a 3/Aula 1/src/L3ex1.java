//Elabore um programa que lê um número inteiro n, seguido de n inteiros, e exibe a média dos n números lidos.

import java.util.Scanner;
public class L3ex1 {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        
        int numero = 1;
        int somaTotal = 0;
        int somaVezes = 0;

        System.out.println("Digite um numero inteiro diferente de 0 para que seja incluido na média\nDigite 0 para sair e calcular a média");
        while (numero != 0) {
            numero = scanner.nextInt();
            if (numero != 0){
                somaTotal += numero;
                somaVezes += 1;     
            }
        }

        if (somaVezes != 0){
            int media = somaTotal / somaVezes;
            System.out.println("A média dos números fornecidos é: " + media);
        } else {
            System.out.println("Sem média");
        }
        
        scanner.close();
    }
}