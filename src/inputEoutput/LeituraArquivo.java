package inputEoutput;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LeituraArquivo {
    public static void main(String[] args) {
        Path diretorioCorrente = Paths.get("");
        String diretorioDoArquivo = diretorioCorrente.toAbsolutePath().toString() +
                "/src/inputEoutput/";

        try {
            File arquivo = new File(diretorioDoArquivo + "arquivo_original.txt");
            System.out.printf("Buscando %s\n", arquivo.getAbsolutePath());

            if(arquivo.exists() && arquivo.isFile()) {
                try (Scanner scanner = new Scanner(arquivo)) {
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                    }
                }
            } else {
                System.out.println("Arquivo não encontrado.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
