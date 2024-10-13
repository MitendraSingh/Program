import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: mchauhan31
 * Date: 23/6/24
 * Time: 11:09 PM
 * To change this template use File | Settings | File Templates.
 */
class Course{
    private String name;
    private String course;
    private int reviewScore;
    private int noOfStudents;

    Course(String name, String course, int reviewScore, int noOfStudents) {
        this.name = name;
        this.course = course;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getCourse() {
        return course;
    }

    void setCourse(String course) {
        this.course = course;
    }

    int getReviewScore() {
        return reviewScore;
    }

    void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    int getNoOfStudents() {
        return noOfStudents;
    }

    void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return  name + "," +reviewScore + ","+
                 noOfStudents;
    }
}

public class Functional04CustomClass {

    public static void main(String args[]){
        final List<Course> courses = Arrays.asList(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring boot", "Framework", 95, 18000),
                new Course("API", "micro services", 97, 22000),
                new Course("full stack", "full stack", 96, 25000),
                new Course("aws", "cloud", 91, 14000),
                new Course("Spring", "cloud", 92, 21000),
                new Course("azure", "cloud", 99, 21000),
                new Course("docker", "cloud", 92, 20000),
                new Course("kubernative", "cloud", 91, 20000));
        final Predicate<Course> reviewScoreGreaterthen95Predicate = course -> course.getReviewScore() > 95;
        final Predicate<Course> reviewScoreGreaterthen90Predicate = course -> course.getReviewScore() > 90;
        final Predicate<Course> reviewScoreLessthen90Predicate = course -> course.getReviewScore() < 90;

        System.out.println(courses.stream().allMatch(reviewScoreGreaterthen95Predicate));
        System.out.println(courses.stream().noneMatch(reviewScoreLessthen90Predicate));
        System.out.println(courses.stream().anyMatch(reviewScoreLessthen90Predicate));

        Comparator<Course> comparingByNoOfStudentIncreasing = Comparator.comparing(Course::getNoOfStudents)  ;
        Comparator<Course> comparingByNoOfStudentDecreasing = Comparator.comparing(Course::getNoOfStudents).reversed()  ;

        System.out.println(courses.stream().sorted(comparingByNoOfStudentIncreasing).collect(Collectors.toList()) );

        System.out.println(courses.stream().sorted(comparingByNoOfStudentDecreasing).collect(Collectors.toList()) );

        Comparator<Course> comparingByNoOfStudentAndNoOfReview = Comparator.comparing(Course::getNoOfStudents)
                .thenComparing(Course::getReviewScore ).reversed()  ;

        System.out.println(courses.stream().sorted(comparingByNoOfStudentAndNoOfReview).collect(Collectors.toList()) );

        Comparator<Course> comparingByNoOfStudents = Comparator.comparing(Course::getNoOfStudents) ;

                System.out.println(
                        courses.stream().sorted(comparingByNoOfStudentAndNoOfReview)
                        .collect(Collectors.toList())
                );


    }
}
