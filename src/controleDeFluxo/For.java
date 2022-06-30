package controleDeFluxo;

public class For {
    public static void main(String[] args) {
        int numero;
        for (numero = 0; numero <= 15; numero++) {
            System.out.println("Valor: " + numero);

            if (numero == 10) {
                break;
            }
        }

        System.out.println("Valor fora do laço: " + numero);

        int numeroTwo;
        for (numeroTwo = 0; numeroTwo <= 100; numeroTwo++) {
            if (numeroTwo > 50 && numeroTwo < 60) {
                continue;
            }

            System.out.println("Valor: " + numeroTwo);
        }


    }
}
