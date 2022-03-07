package Cycles.TaskOne;

public class Task3 {
    // Необходимо вывести на экран таблицу умножения на 3:
    public static void main(String[] args) {
        int number = 3;
        int result;
        for (int i = 1; i < 11; i++) {
            result = number*i;
            System.out.println(number+"*"+i+"="+result);
        }
    }
}
