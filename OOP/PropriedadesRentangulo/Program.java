package OOP.PropriedadesRentangulo;

import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.println("Digite a altura do retângulo: ");
        ret.altura = sc.nextDouble();

        System.out.println("Digite a largura do retângulo : ");
        ret.largura = sc.nextDouble();

        sc.close();

        System.out.println("A area do retângulo é : " + ret.Area());
        System.out.println("O perimetro do retângulo é : " + ret.Perimetro());
        System.out.println("A diagonal do retângulo é : " + ret.Diagonal());
    }
}
