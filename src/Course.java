import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Course {
   protected String courseName;
    protected double price;
    protected ArrayList<Student> students = new ArrayList<>();
    protected  boolean needExperience;
    protected  Date startDate, endDate;
    protected int studentCount;

    public Course(String courseName, double price, boolean needExp,  String startDate, String endDate,int count) {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        this.courseName = courseName;
        this.price = price;
        this.needExperience = needExp;
        this.studentCount = count;

        try {
            this.startDate = sdf.parse(startDate) ;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            this.endDate = sdf.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean hasFreePlace(){
        return students.size() <  studentCount;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);

    }
}
