import java.util.Scanner;

public class Human {

    protected String name, phone;

    public void speak(String text) {
        System.out.println(text);
    }

    public String answer() {
        Scanner scanner = new Scanner(System.in) ;
        String answer = scanner.next();
        //System.out.println(answer);
        return answer;

    }

    public boolean compare(double first, double second){
        return first>= second;
    }
}