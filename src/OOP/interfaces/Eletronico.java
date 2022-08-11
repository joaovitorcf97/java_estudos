package OOP.interfaces;

public interface Eletronico {
    // Método abstrato
    void ligar();

    // Método padrão
    default void desligar() {
        System.out.println("Desligando o eletronico");
    }

    // Método estatico
    static boolean ehEletronico() {
        return true;
    }
}
