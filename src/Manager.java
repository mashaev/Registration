import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Manager extends Human {


    private ArrayList<Student> students = new ArrayList<>();

    private ArrayList<Course> courses = new ArrayList<>();



    public Manager(String name, String phone ) {
        this.name = name;
        this.phone = phone;

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




    public boolean registerStudent(Student student, Course course){
         if (student.wallet < course.price){
             speak("You don`n have enough money");
           return false;
         }

         if (!student.hasExprerience && course.needExperience){
             speak("Needed experience");
             return false;
         }

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
         String time = sdf.format(course.startDate);

         if (!time.equals(student.time)){
             speak("Choosen time not fit for you");
             return false;

         }

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
