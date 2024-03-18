import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite até qual número devemos mostrar os impares : ");
        int max = sc.nextInt();

        for (int i = 1 ; i <= max ; i++){
            if(i % 2 != 0){
                System.out.println(i);
            };
            i++;
        }
        sc.close();
    }
}
