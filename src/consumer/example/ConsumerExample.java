package consumer.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        List<String> musicas = Arrays.asList("Dance D'Amour", "Poison",
                "Devils");
        Consumer<List<String>> adicionarBrilho =
                lista -> lista.stream().forEach(itemDaLista -> System.out.println( " \u2728 " + itemDaLista + " \u2728 "));

        adicionarBrilho.accept(musicas);
    }
}
