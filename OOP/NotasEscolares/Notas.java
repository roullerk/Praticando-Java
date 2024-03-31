package OOP.NotasEscolares;

public class Notas {
    String nome;
    double notaUm;
    double notaDois;
    double notaTres;

    public double notaPrimeiroSemestre() {
        return notaUm + notaDois + notaTres;
    }

    public double Avaliacao() {
        if (notaPrimeiroSemestre() < 60) {
            return 60 - notaPrimeiroSemestre();
        } else {
            return 0.0;
        }
    }

}
