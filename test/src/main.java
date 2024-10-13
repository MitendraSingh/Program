import java.sql.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 10/5/24
 * Time: 4:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class main {
    private static void print(int number){
                    System.out.print(number);
    }
    private static void printAllEmlent(List<Integer> numbers){
        numbers.stream().forEach(main :: print);

    }


    public static void main(String args[]){
      printAllEmlent(Arrays.asList(12,1,4,6,7,8,9,2,14,5));


    }



}
