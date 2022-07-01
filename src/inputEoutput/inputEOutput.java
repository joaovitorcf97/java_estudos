package inputEoutput;

import java.util.Scanner;

public class inputEOutput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Qual o nome do seu animal de estimação? ");

            String input = scanner.nextLine();

            System.out.printf("A sua resposta é %s\n", input);
        }
    }
}
