import java.util.Scanner;

public class L1ex3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salario atual:");
        double salarioAtual = scanner.nextDouble();

        double salarioAtualizado = salarioAtual * 1.25;

        System.out.println("O seu salario atualizado é: " + salarioAtualizado);
        
        scanner.close();
    }
}
