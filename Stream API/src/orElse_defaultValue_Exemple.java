import java.util.Optional;

public class orElse_defaultValue_Exemple {
    public static void main(String[] args) {
      //  Optional<String> optionalValue = Optional.ofNullable(null);
       // String result = optionalValue.orElse("Default");
       // System.out.println(result);

        //Optional<String> optionalValue = Optional.ofNullable(null);
        //String result = optionalValue.orElseGet(() -> "Value from Supplier");
        //System.out.println(result);

        //Optional<String> optionalValue = Optional.ofNullable(null);
        //String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));

        Optional<String> optionalValue = Optional.of("Hello");
        optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));

    }
}
