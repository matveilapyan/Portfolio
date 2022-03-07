package Cycles.TaskTwo;
//Необходимо, чтоб программа выводила на экран вот такую последовательность:
//
//7 14 21 28 35 42 49 56 63 70 77 84 91 98
public class Task1 {
    public static void main(String[] args) {
        int i = 7;
        while(i<98) {
            i +=7;
            System.out.println(i+" ");
        }
    }
}
