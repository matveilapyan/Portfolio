package Cycles.Victorina;

import java.util.Locale;
import java.util.Scanner;

public class realize {

    public void warding(String question) {
        Scanner scanner = new Scanner(System.in);
        boolean val = false;
        int counter=0;
        System.out.println(question);
            System.out.println("Write your answer");
            String name = scanner.next();
            switch (name.toLowerCase(Locale.ROOT)) {
                case ("1"):
                    System.out.println("right");
                    val = false;
                    counter++;
                    break;
                case ("ответ"):
                    System.out.println("right is 1");
                    val = true;
                    counter++;
                    break;
                default:
                    warding(question);
            }
    }
}
