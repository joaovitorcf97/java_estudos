package OOP.herenca;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    @Override
    public void fazerAdmissao() {
        System.out.println("Olá, professor! Seu salário será de " + salario);
    }
}
