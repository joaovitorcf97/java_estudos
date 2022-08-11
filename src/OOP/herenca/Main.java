package OOP.herenca;

public class Main {
    public static void main(String[] args) {
        Pessoa professor = new Professor("Pedro", 40, 10000);
        professor.fazerAniversario();
        professor.fazerAdmissao();

        Pessoa aluno = new Aluno("João", 11, "5º ano");
        aluno.fazerAniversario();
        aluno.fazerAdmissao();

        Escola escola = new Escola();
        escola.cadastrarPessoa(professor);
        escola.cadastrarPessoa(aluno);
    }
}
