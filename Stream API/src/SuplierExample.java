import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SuplierExample {
    public static void main(String[] args) {
        //usar o supplier como expressao lambda para fornecer uma saudacao personalizada

    Supplier<String> saudacao= ()->"Ola, seja bem vindo!";
        //usar o supplier para obter uma lista com 5 saudacoes

        List<String>listaSaudacoes = Stream.generate(()-> "Ola, seja bem vindo!")
                .limit(2)
                .toList();
        //imprimir as saudacoes geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
