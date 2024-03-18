import java.util.Scanner;

public class SomadeDoisNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o primeiro número da Soma : ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo número da Soma : ");
        int segundoNumero = sc.nextInt();

        //saida de dados
        System.out.println("O valor da soma dos dois números é : ");
        System.out.println(primeiroNumero + segundoNumero);

        //finaliza scanner
        sc.close();
    }
}