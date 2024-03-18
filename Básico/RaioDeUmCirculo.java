import java.util.Scanner;

public class RaioDeUmCirculo {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o valor de raio : ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        
        //saida de dados
        System.out.println("O valor da área é : ");
        System.out.printf("%.4f",area);

        //finaliza scanner
        sc.close();
    }
}
