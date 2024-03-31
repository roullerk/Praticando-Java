package OOP.NotasEscolares;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notas nt = new Notas();

        System.out.println("Digite a primeira nota do semestre : ");
        nt.notaUm = sc.nextDouble();

        System.out.println("Digite a segunda nota do semestre : ");
        nt.notaDois = sc.nextDouble();

        System.out.println("Digite a terceira nota do semestre : ");
        nt.notaTres = sc.nextDouble();

        sc.close();

        System.out.printf("Nota final : %.2f%n", nt.notaPrimeiroSemestre());
        if (nt.notaPrimeiroSemestre() < 60) {
            System.out.println("Reprovado");
            System.out.printf("Faltou: %.2f", nt.Avaliacao());
        } else {
            System.out.println("Aprovado");
        }
    }
}
