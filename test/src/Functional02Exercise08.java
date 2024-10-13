import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 18/6/24
 * Time: 9:37 AM
 * Qube the every number and sum of qube.
 */
public class Functional02Exercise08 {
    public static void printSumofQube(List<Integer> numbers){
        System.out.print(numbers.stream()
                .map(number -> number*number*number) // qube the each number
                .reduce(0,(a,b)-> a+b)); // add the qube

    }
    public static void main(String args[]){
        final List<Integer> integers = Arrays.asList(3, 2, 4, 5, 11, 9, 1, 20, 19);
        printSumofQube(integers);
    }
}
