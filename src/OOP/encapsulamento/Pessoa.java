package OOP.encapsulamento;

public class Pessoa {
    String nome;
    private int idade;

    public Pessoa(String nome) {
        idade = 0;
        this.nome = nome;
    }

    public void fazerAniversario() {
        idade++;
    }

    public void setIdade(int idade) {
        if(idade >= 0) {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }
}
