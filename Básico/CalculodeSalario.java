import java.util.Scanner;

public class CalculodeSalario {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o número do funcionário : ");
        int numFuncionario = sc.nextInt();
        System.out.println("Digite as horas o número de horas trabalhadas pelo funcionário : ");
        int hrsTrab = sc.nextInt();
        System.out.println("Digite quanto ele recebe por hora :");
        double salHrsTrab = sc.nextDouble();


        //saida de dados
        System.out.println();
        System.out.println("O funcionário número : " + numFuncionario);
        System.out.printf("Ele deve receber : U$ %.2f", (salHrsTrab * hrsTrab));

        //finaliza scanner
        sc.close();
    }
}
