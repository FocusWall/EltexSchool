package tasks;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите выражение наподобие (5*8-4)+13*(9+12)");
        Scanner sc = new Scanner(System.in);
	    String str = sc.next();
        System.out.println(calc.polskaToAnswer(calc.exprToPolska(str)));

    }
}
