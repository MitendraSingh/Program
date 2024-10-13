import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 17/6/24
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Functional01 {
    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllElement(List<Integer> numbers) {
        //numbers.stream().forEach(Functional01::print);
        numbers.stream().forEach(System.out::println);
    }

    /*public static boolean isEven(int number) {
        return number % 2 == 0;
    }*/

    // number -> number%2==0
    private static void printEvenElement(List<Integer> numbers) {
        //numbers.stream().forEach(Functional01::print);
        numbers.stream() // convert to steam
                .filter(number -> number % 2 == 0)      // lambda expression
                .forEach(System.out::println);
        //.filter(Functional01::isEven) // allows only even number
    }

    private static void printSquareOfEvenNumber(List<Integer> numbers) {
        numbers.stream()  // convert to steam
                .filter(number -> number % 2 == 0)      // lambda expression
                // mapping x-> x*x
                .map(number -> number*number)
                .forEach(System.out::println);
        //.filter(Functional01::isEven) // allows only even number
    }

    public static void main(String args[]) {
        final List<Integer> numbers = Arrays.asList(12, 1, 4, 6, 7, 8, 9, 2, 14, 5);
        //printAllElement(numbers);
        //printEvenElement(numbers);
        printSquareOfEvenNumber(numbers);
    }
}
