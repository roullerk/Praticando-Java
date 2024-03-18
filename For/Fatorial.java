import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número a ser fatorado : ");
        int fatorado = sc.nextInt();

        int fatorial = 1;


        if (fatorado == 0) {
            fatorial = 1;
        } else {
            for (int i = 1; i < fatorado; i++) {
                fatorial +=  fatorial * i;       
            }
        }
        System.out.println("O valor de " + fatorado + "! fatorado é : " +fatorial + "!!!");
        sc.close();
    }
}
