package Cycles.Victorina;

import java.util.Scanner;

public class LogicQuestion {
    public void mffd() {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Question 1");
        System.out.println("Write your answer");
        input = scanner.next();
        switch (input) {
            case ("1"):
                System.out.println("right");
                break;
            case ("2"):
                System.out.println("false");
                break;
            case ("3"):
                System.out.println("false");
                break;
            case ("4"):
                System.out.println("false");
                break;
            default:
                System.out.println("Skip");
                break;
        }
    }
}
