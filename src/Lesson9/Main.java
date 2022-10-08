package Lesson9;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) {

        List<Students> result = getListOfStudents(3,3);
        //1 задание
        result.stream().flatMap(students -> students.getCourseList().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(students -> students.getCourseList().stream()).collect(Collectors.toSet());

        //2 задание
        result.stream().sorted((students1,students2) -> students1.getCourseList().size() - students2.getCourseList().size()).limit(3).collect(Collectors.toList());

        //3 задание
        Course paramCourse = new Course("course1");
        result.stream().filter(students -> students.getCourseList().contains(paramCourse)).collect(Collectors.toList());

        System.out.println();

    }

    private static List<Students> getListOfStudents(int j, int m){
        ArrayList<Students> result = new ArrayList<>();
        for (int i=0; i<j ;i++){
            ArrayList<Course> courses = new ArrayList<>();
            for (int h=0; h<m ;h++){
                courses.add(new Course("course"+h));
            }
            result.add(new Students("student"+i, courses));
        }
        return result;
    }



}


