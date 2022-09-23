package bifunction.example;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<String, Double, String> taxaEntrega =
                (produto, distancia) -> distancia >= 5.0 ?
                        "O total da entrega do produto: " + produto + String.format("será: R$ %.2f",
                1.0 * distancia) : "O total de entrega do produto: " + produto + " será: R$ 2,50";

        System.out.println(taxaEntrega.apply("Chá Gelado", 3.2));
    }
}
