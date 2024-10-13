import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 17/6/24
 * Time: 8:18 PM
 * Print the number of character in each course
 */
public class Functional01Exercise06 {
    public static void printAllCourses(List<String> courses) {
        courses.stream()
                .map(course -> course.length())
                .forEach(System.out:: println);

    }
    public static void main(String[] args){
        final List<String> strings = Arrays.asList("Spring", "Spring boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printAllCourses(strings);
    }
}
