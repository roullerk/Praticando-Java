import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();

        //repetição
        while (senha != 2002) {
            System.out.println();
            System.out.println("Senha invalida");
            System.out.println("Digite sua senha novamente : ");
            senha = sc.nextInt();
        }
        //saida de dados
        System.out.println();
        System.out.println("Acesso Permitido");

        //finaliza scanner
        sc.close();
    }
}
