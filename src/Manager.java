import java.util.ArrayList;
import java.util.Date;

public class Manager extends Human {

    String[] lessonTimes;
    private final double price = 12000;
    private ArrayList<Student> students = new ArrayList<>();

    private ArrayList<Course> courses = new ArrayList<>();



    public Manager(String name, String phone, String[] times) {
        this.name = name;
        this.phone = phone;
        this.lessonTimes = times;
    }

    public void appendCourse(String courseName, double price, boolean needExp,  String startDate, String endDate,int count){
        Course course = new Course(courseName,price,needExp,startDate,endDate,count);
        courses.add(course);
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

    public void printCourseName(){
        for (int i=0; i<courses.size();i++){
            System.out.println(courses.get(i).courseName);
        }
    }

    public double getCoursePrice(){
        return price;
    }

    public String[] getLessonTimes(){
        return lessonTimes;
    }

    public boolean registerStudent(Student student, Course course){
       if (course.hasFreePlace()){
           course.addStudent(student);
           return true;
       }
       return false;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
}
