import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 17/6/24
 * Time: 8:27 PM
 * sum of digits
 */
public class Functional02 {
    public static int addListStructured(List<Integer> numbers){
        return numbers.stream()
                //.reduce(0,Functional02::sum);
                //.reduce(0,(x,y)->x+y);
                //.reduce(0,Integer::sum);
                //.reduce(0,(x,y)->x>y ?x:y); // maximum element in array
               /* .reduce(Integer.MIN_VALUE, (x, y) -> {
                    System.out.println(x + " "+ y);
                    final Integer integer = x > y ? x : y;
                    return integer;
                }); // maximum element in array*/
        .reduce(Integer.MAX_VALUE, (x, y) -> {
            System.out.println(x + " "+ y);
            final Integer integer = x < y ? x : y;
            return integer;
        }); // min element in array

    }
    private static int sum(int a , int b){
        System.out.println(a + " " + b);
        return a+b;

    }
           /* 0 12
            12 1
            13 4
            17 6
            23 7
            30 8
            38 9
            47 2
            49 14
            63 5
            68*/
    public static void main(String args[]) {
        final List<Integer> numbers = Arrays.asList(12, 1, 4, 6, 7, 8, 9, 2, 14, 5);
        int sum= addListStructured(numbers);
        System.out.print(sum);
    }


}
