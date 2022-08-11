package OOP.herenca;

public class Aluno extends Pessoa {
    private String serie;

    public Aluno(String nome, int idade, String serie) {
        super(nome, idade);
        this.serie = serie;
    }

    public void fazerAniversario() {
        super.fazerAniversario();
        System.out.println("Feliz aniversário, querido(a) aluno(a)!");
    }

    @Override
    public void fazerAdmissao() {
        System.out.println("Olá, aluno! Peça a seus pais para fazerem a sua matricula na escola" );
    }

    public void estudar() {
        System.out.println("Estude muito!");
    }
}
