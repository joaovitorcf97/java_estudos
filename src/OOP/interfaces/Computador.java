package OOP.interfaces;

public class Computador implements Eletronico, Aparelho{

    @Override
    public void ligar() {
        System.out.println("Ligando o computador");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o computador");
    }
}
