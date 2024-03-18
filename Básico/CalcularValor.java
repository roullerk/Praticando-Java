import java.util.Scanner;

public class CalcularValor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o código da primeira peça : ");
        int primeiraPeca = sc.nextInt();
        System.out.println("Digite a quantidade de peças " + primeiraPeca + " : ");
        int qntdPrimeiraPeca = sc.nextInt();
        System.out.println("Digite o valor unitário de cada peça");
        double vlUnitPrimeiraPeca = sc.nextDouble();
        
        System.out.println();
        System.out.println("Digite o código da segunda peça : ");
        int segundaPeca = sc.nextInt();
        System.out.println("Digite a quantidade de peças " + segundaPeca + " : ");
        int qntdSegundaPeca = sc.nextInt();
        System.out.println("Digite o valor unitário de cada peça");
        double vlUnitSegundaPeca = sc.nextDouble();

        //saida de dados
        System.out.println();
        System.out.printf("O total a pagar é : R$ %.2f", ((qntdPrimeiraPeca * vlUnitPrimeiraPeca) + (qntdSegundaPeca * vlUnitSegundaPeca)));

         //finaliza scanner
         sc.close();
    }
}
