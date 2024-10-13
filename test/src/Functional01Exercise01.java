import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 17/6/24
 * Time: 5:41 PM
 * Print only even number.
 */
public class Functional01Exercise01 {

    public static void printAllOddNumber(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2!=0)  // lambda expression to print number
                .forEach(System.out::println);

    }
    public static void main(String args[]){
        final List<Integer> integers = Arrays.asList(2, 4, 5, 11, 9, 1, 20, 19);
        printAllOddNumber(integers);


    }
}
