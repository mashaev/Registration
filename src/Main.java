import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Manager manager = new Manager("Nargiza", "999545454");
         manager.appendCourse("Java programm",12000,true,"20:00","22:00",12);
         manager.appendCourse("Web programm",9000, false,"18:00","20:00",12);

         manager.printCourseName();

          Student student = new Student();
          student.hasExprerience = true;
          student.name = "Timur";
          student.wallet = 12000;
          student.age = 25;
          student.time ="20:00";


     ArrayList<Course> courses = manager.getCourses();

     if (manager.registerStudent(student,courses.get(0))){
         manager.speak("You successfully registered");
     }

    }
}
