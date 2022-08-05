package OOP.encapsulamento;

public class FabricaPessoas {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("João");
        Pessoa ana = new Pessoa("Ana");

        joao.setIdade(25);
        ana.setIdade(-26);

        System.out.println(joao.getIdade());
        System.out.println(ana.getIdade());

    }
}
