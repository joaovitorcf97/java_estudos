package inputEoutput;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ManipulacaoDeArquivos {
    public static void main(String[] args) {
        Path diretorioCorrente = Paths.get("");
        String diretorioDoArquivo = diretorioCorrente.toAbsolutePath().toString() +
                "/src/inputEoutput/";

        try {
            File origem = new File(diretorioDoArquivo + "arquivo_original.txt");
            File alvo = new File(diretorioDoArquivo + "duplicata.txt");
            Files.copy(origem.toPath(), alvo.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
