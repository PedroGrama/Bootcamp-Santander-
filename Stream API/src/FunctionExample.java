import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExample {
    public static void main(String[] args) {
        //criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,100);
        //usar a funcao como expressao labda para dobrar todos os numeros
        Function<Integer, Integer>dobrar = numero -> numero*2;
        //usar a funcao para dobrar todos os numeros no Stream e armazea-lo em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n->n*2)
                .toList();
        //imprimir a lista de numeros dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
