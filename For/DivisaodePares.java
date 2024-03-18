import java.util.Scanner;

public class DivisaodePares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de pares que serão divididos : ");
        int qntd = sc.nextInt();

        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite o primeiro número : ");
            double primeiro = sc.nextDouble();
            System.out.println("Digite o segundo número : ");
            double segundo = sc.nextDouble();
            if (segundo == 0) {
                System.out.println("Divisão impossível");
                System.out.println();
            } else {
                System.out.print("O valor da divisão de " + primeiro + " por " + segundo + " é : ");
                System.out.printf("%.1f", (primeiro / segundo));
                System.out.println();
            }
            sc.close();
        }
    }
}
