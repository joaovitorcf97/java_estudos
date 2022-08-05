package OOP.pacote;

public class MeuPacote {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));

        System.out.println(MeuPacote.class.getResource("MeuPacote.class"));
    }
}
