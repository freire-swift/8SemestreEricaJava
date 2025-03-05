import java.util.Scanner;

public class L1ex5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do retangulo:");
        double altura = scanner.nextDouble();
        System.out.println("Digite a base do retangulo");
        double base = scanner.nextDouble();

        double areaRetangulo = altura * base;

        System.out.println("A area do retangulo é: " + areaRetangulo);

        scanner.close();
    }
}