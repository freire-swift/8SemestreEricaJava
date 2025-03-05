//[while] Elabore um programa que recebe valores naturais até que seja digitado o valor zero. 
//O programa deverá exibir a média aritmética. Lembre-se: o valor zero apenas sinaliza o fim da entrada, não deve ser contabilizado.
import java.util.Scanner;
public class L3ex2 {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        
        int numero = 1;
        int somaTotal = 0;
        int somaVezes = 0;

        System.out.println(
                "Digite um numero natural diferente de 0 para que seja incluido na média\nDigite 0 para sair e calcular a média");
        while (numero != 0) {
            numero = scanner.nextInt();
            if (numero != 0 && numero > 0) {
                somaTotal += numero;
                somaVezes += 1;
            }
            if (numero < 0){
                System.out.println("Numero menor que 0 não incluido");
            }
        }

        if (somaVezes != 0) {
            int media = somaTotal / somaVezes;
            System.out.println("A média dos números fornecidos é: " + media);
        } else {
            System.out.println("Sem média");
        }
        
        scanner.close();
    }
}