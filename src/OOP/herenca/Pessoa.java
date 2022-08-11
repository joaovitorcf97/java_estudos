package OOP.herenca;

public abstract class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // Getters e Setters

    // Metodo concreto
    public void fazerAniversario() {
        idade++;
    }

    // Metodo abstrato
    public abstract void fazerAdmissao();

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0) {
            this.idade = idade;
        }
    }
}
