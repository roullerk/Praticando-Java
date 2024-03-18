import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade a ser verificada");
        int max = sc.nextInt();
        int in = 0;
        int out = 0;

        for(int i = 1; i <=max ; i++){
            System.out.println("Digite o " + i + "° número inteiro");
            int numInte = sc.nextInt();
            if(numInte >= 10 && numInte <= 20){
                in++;
            }
            else{
                out++;
            }
        }
        System.out.println();
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
