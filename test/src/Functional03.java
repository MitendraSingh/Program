import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 21/6/24
 * Time: 8:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Functional03 {
    public static void main(String args[]){
        final List<Integer> integers = Arrays.asList(12, 1, 4, 6, 7, 8, 9, 2, 14, 5);

        final Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        final Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x%2==0;
            }
        };

        final Function<Integer,Integer> squareFunction = x -> x * x;

        final Function<Integer,Integer> squareFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        } ;

        final Consumer<Integer> println = System.out::println;
        final Consumer<Integer> println2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer x) {
                System.out.println(x);
            }
        } ;

        integers.stream()
                .filter(isEvenPredicate2)
                .map(squareFunction2)
                .forEach(println2);

        final BinaryOperator<Integer> sum = Integer::sum;
        final BinaryOperator<Integer> sum2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                System.out.println(x + " " + y);
                return x+y;
            }
        };

        //  No input as parameter > return something
       // Supplier<Integer> randomIntergerSupplier = () ->2;

        Supplier<Integer> randomIntergerSupplier = () -> {
            final Random random = new Random();
            final int randomInt = random.nextInt(100);
            return randomInt;
        };

        System.out.println("random " +randomIntergerSupplier.get());




        final Integer reduce = integers.stream()
                .reduce(0, sum2);
        System.out.println(reduce);
    }
}
