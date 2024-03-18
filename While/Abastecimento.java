import java.util.Scanner;

public class Abastecimento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // entrada de dados
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite 1 para alcool, 2 para gasolina, 3 para diesel e 4 para sair");
        int escolha = sc.nextInt();

        //repetição de dados
        while (escolha != 4) {
            System.out.println();
            if (escolha == 1) {
                alcool++;
                System.out.println("Escolheu Álcool");
                System.out.println();
                System.out.println("Digite o próximo");
                escolha = sc.nextInt();
            } else if (escolha == 2) {
                gasolina++;
                System.out.println("Escolheu Gasolina");
                System.out.println();
                System.out.println("Digite o próximo");
                escolha = sc.nextInt();
            } else if (escolha == 3) {
                diesel++;
                System.out.println("Escolheu Diesel");
                System.out.println();
                System.out.println("Digite o próximo");
                escolha = sc.nextInt();
            } else {
                System.out.println("Digito inválido");
                System.out.println("Por favor digite novamente");
                escolha = sc.nextInt();
            }
        }
        //saida de dados
        System.out.println();
        System.out.println("Muito Obrigado!");
        System.out.println("Número de abastecimentos com álcool : " + alcool);
        System.out.println("Número de abastecimentos com gasolina : " + gasolina);
        System.out.println("Número de abastecimentos com diesel : " + diesel);

        //finaliza Scanner
        sc.close();
    }
}
