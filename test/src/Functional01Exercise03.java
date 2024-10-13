import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 17/6/24
 * Time: 5:53 PM
 * Print course that contains Spring
 */
public class Functional01Exercise03 {
    public static void printAllCourses(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out:: println);

    }
    public static void main(String[] args){
        final List<String> strings = Arrays.asList("Spring", "Spring boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printAllCourses(strings);
    }
}
