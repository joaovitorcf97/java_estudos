package OOP.herenca;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Pedro", 40, 10000);
        professor.fazerAniversario();

        Aluno aluno = new Aluno("João", 11, "5º ano");
        aluno.fazerAniversario();
    }
}
