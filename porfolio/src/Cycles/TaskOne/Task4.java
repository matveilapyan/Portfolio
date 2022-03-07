package Cycles.TaskOne;

import java.util.Scanner;
//Напишите программу, где пользователь вводит любое целое
// положительное число. А программа суммирует все числа
// от 1 до введенного пользователем числа.
public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int tmp = 0;
        do {
            System.out.println("Input number: ");
            number = scanner.nextInt();
        } while (number<0);
        System.out.println("Your number: "+number);
        for (int i = 0; i < number+1; i++) {
            tmp = i+tmp;
        }
        System.out.println(tmp);
    }
}
