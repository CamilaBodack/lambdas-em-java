package functions;

import java.util.function.Function;

public class LambdaFunction {

    public static void main(String[] args) {

        Function<Double, Double> precoComImposto =
                preco -> (preco * 0.025) + preco;

        System.out.println(precoComImposto.apply(5.55));
    }
}

