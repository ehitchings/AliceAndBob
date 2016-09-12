package AliceAndBobGreeting;
import java.util.Scanner;
/**
 * Created by evanhitchings on 9/9/16.
 */

public class AliceAndBobGreeting {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Greeting greeting = new Greeting();
        System.out.println("What's your name?");
        System.out.println(greeting.greet(reader.nextLine()));
    }
}
