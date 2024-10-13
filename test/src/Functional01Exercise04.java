import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 17/6/24
 * Time: 5:56 PM
 * Print those courses who have atleast 4 character
 */
public class Functional01Exercise04 {
    public static void printAllCourses(List<String> courses) {
        courses.stream()
                .filter(course -> course.length()>= 4)
                .forEach(System.out:: println);

    }
    public static void main(String[] args){
        final List<String> strings = Arrays.asList("Spring", "Spring boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printAllCourses(strings);
    }
}
