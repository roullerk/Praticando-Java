import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o valor do ponto A : ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor do ponto B : ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor do ponto C : ");
        double c = sc.nextDouble();
        System.out.println();

        //calculo de areas
        double triangulo = (a * c /2);
        double circulo = Math.PI * c * c;
        double trapezio = (a + b) / 2 * c;
        double quadrado = b * b;
        double retangulo = a * b;

        //saida de dados
        System.out.println();
        System.out.printf("A área do triângulo retângulo é : %.3f%n", triangulo);
        System.out.printf("A área do círculo é : %.3f%n", circulo);
        System.out.printf("A área do trapézio é : %.3f%n", trapezio);
        System.out.printf("A área do quadrado é : %.3f%n", quadrado);
        System.out.printf("A área do retângulo é : %.3f%n", retangulo);

        //finaliza scanner
        sc.close();
    }
}
