import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 17/6/24
 * Time: 8:16 PM
 * Print the qube of odd number
 */
public class Functional01Exercise05 {
    public static void printAllOddNumber(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2!=0)  // lambda expression to print number
                .map(number -> number*number*number)
                .forEach(System.out::println);

    }
    public static void main(String args[]){
        final List<Integer> integers = Arrays.asList(3,2, 4, 5, 11, 9, 1, 20, 19);
        printAllOddNumber(integers);


    }
}
