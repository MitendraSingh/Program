import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 23/6/24
 * Time: 10:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Functional03Exercise12 {
    public static void main(String args[]){
        final List<Integer> integers = Arrays.asList(12, 1, 4, 6, 7, 8, 9, 2, 14, 5);

        final BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
        final BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                System.out.println(x+ " "+y);
                return x+y;
            }
        };
        final Integer reduce = integers.stream()
                .reduce(0, sumBinaryOperator2);
        System.out.println(reduce);
    }
}
