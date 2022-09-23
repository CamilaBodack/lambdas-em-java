package supplier.example;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<LocalDateTime> supplierHora = () -> LocalDateTime.now();

        System.out.println(supplierHora.get());
    }
}
