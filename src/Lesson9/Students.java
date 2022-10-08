package Lesson9;
import java.util.List;
public class Students {


           private String name;

        List<Course> courseList;

        public Students(String name, List<Course> courseList) {
            this.name = name;
            this.courseList = courseList;
        }

        public String getName() {
            return name;
        }

        public List<Course> getCourseList() {
            return courseList;
        }
    }
