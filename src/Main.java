import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Manager manager = new Manager("Nargiza", "999545454", new String[] {"18:00","20:00"});
         manager.appendCourse("Java",12000,false,"20:00","22:00",12);


         manager.printCourseName();

       /* for (int i = 0; i<3;i++) {

            manager.speak("Hello! My name is " + manager.name );
            manager.speak("What`s your name");

            Student student = new Student();
            student.wallet = 12000;
            student.time = "20:00";
            student.name = student.answer();

            manager.speak("How old are you?");
            student.age = Integer.parseInt(student.answer());
            manager.speak("Do you have experience?");

            String exp = student.answer();
            if (exp.equals("Yes")) {
                student.hasExprerience = true;
            } else {
                student.hasExprerience = false;
            }

            student.speak("How much your course?");
            double price = manager.getCoursePrice();
            manager.speak(String.valueOf(price));


            if (student.compare(student.wallet, price)) {
                student.speak("Which time your course start?");
                String[] times = manager.getLessonTimes();

                if (student.chooseTime(times)) {
                    manager.speak("You are registered");

                } else {
                    student.speak("it`s not my convenient time!");
                }

            } else {
                student.speak("Sorry! Not enough money");
            }
        }

        ArrayList<Student> students = manager.getStudents();

         for (int i=0; i <students.size();i++){
             manager.speak(students.get(i).name + "and" + manager.lessonTimes);
         }*/

    }
}
