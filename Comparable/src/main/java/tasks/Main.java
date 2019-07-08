package tasks;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        User usr1 = new User(12345);
        User usr2 = new User(54321);

        System.out.println(usr1.compareTo(usr2));
        System.out.println(usr1.equals(usr2));
    }
}
