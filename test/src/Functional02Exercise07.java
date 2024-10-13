import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 17/6/24
 * Time: 9:05 PM
 * Square the every number and sum of squares
 */
public class Functional02Exercise07 {
    public static void printSumOfSquare(List<Integer> numbers){
        System.out.print(numbers.stream()
                .map(number -> number*number) // square the each number
                .reduce(0,(a,b)-> a+b)); // add the square

    }
    public static void main(String args[]){
        final List<Integer> integers = Arrays.asList(3,2, 4, 5, 11, 9, 1, 20, 19);
        printSumOfSquare(integers);
    }
}
