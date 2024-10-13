import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 23/6/24
 * Time: 10:31 PM
 * print list of square number.
 */
public class Functional03BehaviourExercise13 {
    public static void main(String args[]){
        final List<Integer> integers = Arrays.asList(12, 1, 4, 6, 7, 8, 9, 2, 14, 5);

        final Function<Integer, Integer> mapper = x -> x * x;
        final List<Integer> square = getCollect(integers, x -> x * x);
        final List<Integer> qube = getCollect(integers, x -> x * x*x);
        final List<Integer> doubleNumber = getCollect(integers, x -> 2*x);

        System.out.println(square);
        System.out.println(qube);
        System.out.println(doubleNumber);
    }

    private static List<Integer> getCollect(List<Integer> integers, Function<Integer, Integer> function) {
        return integers.stream()
                .map(function)
                .collect(Collectors.toList());
    }
}
