package Cycles.SecretTask;

import java.util.Scanner;

// Представим, что у нас есть загадка: "Что это такое: синий,
// большой, с усами и полностью набит зайцами?" Ответ: троллейбус.
public class Secret {
    public static void main(String[] args) {
        System.out.println("Загадка: ");
        System.out.println("Представим, что у нас есть загадка: \"Что это такое: синий, \n" +
                " большой, с усами и полностью набит зайцами?");
        Scanner scanner = new Scanner(System.in);
        String answer;
        boolean value;
        value = false;
        for (int i = 1; i <= 3; i++) {
            if (value == true) {
                break;
            }
            System.out.println("You can write - " +"Сдаюсь");
            System.out.print("Input text: ");
            answer = scanner.next();

            switch (answer){
                case ("Троллейбус"):
                    System.out.println("Right");
                    value = true;
                    break;
                    case ("Сдаюсь"):
                        System.out.println("Right answer - Троллейбус");
                        value=true;
                        break;
                default:
                    System.out.println("Think more");
            }
            if(i==3){
                System.out.println("Tries is over");
            }
        }
    }
}
