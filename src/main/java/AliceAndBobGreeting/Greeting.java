package AliceAndBobGreeting;

/**
 * Created by evanhitchings on 9/9/16.
 */
public class Greeting {

    public String greet(String name){
        if (name.equalsIgnoreCase("Bob") || name.equalsIgnoreCase("Alice")){
            return "Hello " + name;
        } else {
            return null;
        }
    }
}
