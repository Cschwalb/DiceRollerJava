import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your roll:  ");
        String roll = scanner.nextLine();
        Dice d = new Dice();
        d.parseAndRoll(roll);
    }
}