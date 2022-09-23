package unaryoperator.example;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        UnaryOperator<Double> impostoSobreProduto =
                precoVinho -> precoVinho >= 50 ?
                        (precoVinho * 0.025) + precoVinho : precoVinho;

        System.out.println(impostoSobreProduto.apply(57.5));
    }
}
