package predicate;

import java.util.function.Predicate;

public class PredicateInterface {

    public static void main(String[] args) {

        String actor = "Brandon Lee";

        Predicate<String> isBrandonLee =
                actorName -> actorName.equalsIgnoreCase("Brandon Lee");

        System.out.println(isBrandonLee.test("Anthony Hopkins"));
        System.out.println(isBrandonLee.test(actor));

    }
}
