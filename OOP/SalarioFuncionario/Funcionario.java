package OOP.SalarioFuncionario;

public class Funcionario {

    String nome;
    double salarioBruto;
    double imposto;

    public double SalarioLiquido() {
        return salarioBruto - imposto;
    }

    public void AumentoSalarial(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

}
