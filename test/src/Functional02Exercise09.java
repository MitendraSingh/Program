import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 18/6/24
 * Time: 9:40 AM
 * Find sum of odd number in list.
 */
public class Functional02Exercise09 {
    public static void printSumOfAllOddNumber(List<Integer> numbers){
        System.out.print(numbers.stream()
                .filter(x-> x%2!=0) //odd numbers
                .reduce(0,(a,b)-> a+b)); // add the odd numbers
    }
    public static void main(String args[]){
        final List<Integer> integers = Arrays.asList(3, 2, 4, 5, 11, 9, 1, 20, 19);
        printSumOfAllOddNumber(integers);
    }
}
