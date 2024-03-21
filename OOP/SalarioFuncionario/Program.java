package OOP.SalarioFuncionario;

import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.println("Digite o nome do Funcionário : ");
        func.nome = sc.nextLine();

        System.out.println("Digite o valor do salário Bruto : ");
        func.salarioBruto = sc.nextDouble();

        System.out.println("Digite o valor do imposto : ");
        func.imposto = sc.nextDouble();

        System.out.printf("O funcionário : %s , recebe : %.2f  em valor líquido. \n", func.nome, func.SalarioLiquido());

        System.out.println("Digite o valor da porcentagem para aumento salarial : ");
        double porcAumento = sc.nextDouble();

        sc.close();

        func.AumentoSalarial(porcAumento);

        System.out.println("O funcionário : " + func.nome + ", com o aumento salarial, está recebendo : "
                + func.SalarioLiquido() + " de salário líquido e " + func.salarioBruto + " salário bruto");
    }
}
