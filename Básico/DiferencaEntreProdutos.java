import java.util.Scanner;

public class DiferencaEntreProdutos {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o valor do produto A : ");
        double produtoA = sc.nextDouble();
        System.out.println("Digite o valor do produto B : ");
        double produtoB = sc.nextDouble();
        System.out.println("Digite o valor do produto C : ");
        double produtoC = sc.nextDouble();
        System.out.println("Digite o valor do produto D : ");
        double produtoD = sc.nextDouble();

        //saida de dados
        System.out.println("A diferença entre os produtos A/B e C/D é : " + (produtoA *produtoB - produtoC *produtoD));
        
        //finaliza scanner
         sc.close();
    }
}
