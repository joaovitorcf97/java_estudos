package OOP;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    LocalDate dataNascimento;
    float altura;
    String situacaoCivil;
    String genero;

    public Pessoa(LocalDate dataNascimento, float altura, String situacaoCivil, String genero) {
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.situacaoCivil = situacaoCivil;
        this.genero = genero;
    }

    public void exibeIdade() {
        LocalDate hoje = LocalDate.now();
        int idade = Period.between(dataNascimento, hoje).getYears();

        System.out.println(idade);
    }
}
