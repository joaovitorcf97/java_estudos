package inputEoutput;

import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LeituraArquivo2 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        Path diretorioCorrente = Paths.get("");
        String diretorioDoArquivo = diretorioCorrente.toAbsolutePath().toString() +
                "/src/inputEoutput/";

        try {
            File arquivo = new File(diretorioDoArquivo + "arquivo_original.txt");
            System.out.printf("Buscando %s\n", arquivo.getAbsolutePath());

            if (arquivo.exists() && arquivo.isFile()) {
                try (Scanner scanner =  new Scanner(arquivo, charset)) {
                    File saida = new File(diretorioDoArquivo + "arquivo_destino.txt");

                    boolean adicionarDados = false;

                    try (FileWriter escritor = new FileWriter(saida, charset, adicionarDados)) {
                        while (scanner.hasNextLine()) {
                            String linha = scanner.nextLine().replace("o", "@");
                            escritor.append(linha);
                            escritor.append('\n');
                        }
                    }
                }
            } else {
                System.out.println("Arquivo não encontrado.");
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
