package arrays;

public class IterandoArrays {
    public static void main(String[] args) {
        String[] letras = {"A", "A", "B", "B"};

        System.out.println(trazerConteudoSemA(letras));
        System.out.println(trazerConteudoSemAUnsandoForeach(letras));
    }

    // For normal
    public static String trazerConteudoSemA(String[] palavras) {
        String resultado = " ";
        if (palavras != null && palavras.length > 0) {
            for (int i = 0; i < palavras.length; i++) {
                resultado = resultado + palavras[i].replace("A", "");
            }
        }

        return resultado;
    }

    // Foreach
    public static String trazerConteudoSemAUnsandoForeach(String[] palavras) {
        String resultado = " ";
        if (palavras != null && palavras.length > 0) {
            for (String palavra : palavras){
                resultado = resultado + palavra.replace("A", "");
            }
        }

        return resultado;
    }
}
