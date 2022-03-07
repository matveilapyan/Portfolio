package GarbageCollector;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        method();
    }
    private static void method(){
        Date date = new Date();
        date = new Date();
        System.out.println(date);
    }
    private static void method2(){

    }
}
