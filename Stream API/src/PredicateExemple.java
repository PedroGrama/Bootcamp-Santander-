import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class PredicateExemple {
    public static void main(String[] args) {
        //criar lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "javascript", "c", "go", "ruby", "javacriptpppp3p");
        //criar um predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
        //usar o Stream para filtrar  as palavras com mais de 5  caracteres e, em seguida
        //imprimir cada palavra que passou no filtro
        palavras.stream()
                .filter(p -> p.length() < 5)
                .forEach(System.out::println);


    }

}
