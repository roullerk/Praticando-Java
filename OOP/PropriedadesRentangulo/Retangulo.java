package OOP.PropriedadesRentangulo;

public class Retangulo {
    double altura;
    double largura;

    public double Area() {
        return altura * largura;
    }

    public double Perimetro() {
        return (altura * 2) + (largura * 2);
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }
}
