public class Student extends Human {

     boolean hasExprerience;
    int age;
    double wallet;
    String time;

    public boolean chooseTime(String[] times){
        for(int i = 0; i<times.length;i++){
            if (time.equals(times[i])){
                  return true;
            }
        }
        return false;

    }
}
