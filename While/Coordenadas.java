import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite a coordenada de X : ");
        double x = sc.nextDouble();
        System.out.println("Digite a coordenada de Y : ");
        double y = sc.nextDouble();

        //repetição
        while( x != 0 && y != 0){
        System.out.println("Digite a coordenada de X : ");
        x = sc.nextDouble();
        System.out.println("Digite a coordenada de Y : ");
        y = sc.nextDouble();
        }
        //finaliza scanner
        sc.close();
    }
}
