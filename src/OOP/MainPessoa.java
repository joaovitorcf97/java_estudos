package OOP;

import java.time.LocalDate;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                LocalDate.of(1997, 3, 12),
                1.7f,
                "Solteiro",
                "Masculino");

        pessoa.exibeIdade();
    }
}
