package binaryoperation.example;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Double> descontoEmReais = (preco, desconto) -> preco * desconto;

        System.out.println(descontoEmReais.apply(5.35, 0.035));
    }
}
