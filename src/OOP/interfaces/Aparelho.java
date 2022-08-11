package OOP.interfaces;

public interface Aparelho {
    default void desligar() {
        System.out.println("Desligando o aparelho");
    }
}
