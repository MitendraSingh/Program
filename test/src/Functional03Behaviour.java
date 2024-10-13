import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 23/6/24
 * Time: 10:20 PM
 * Parameterise passing of logic
 */
public class Functional03Behaviour {
    public static void main(String args[]){
        final List<Integer> integers = Arrays.asList(12, 1, 4, 6, 7, 8, 9, 2, 14, 5);

        final Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        filterAndPrint(integers,  x -> x % 2==0);

        final Predicate<Integer> oddPredicate = x -> x % 2 != 0;
        filterAndPrint(integers, x -> x % 2 != 0);
    }

    private static void filterAndPrint(List<Integer> integers, Predicate<Integer> predicate) {
        integers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
