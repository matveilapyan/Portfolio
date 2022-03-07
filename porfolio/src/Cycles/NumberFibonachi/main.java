package Cycles.NumberFibonachi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(12);
        list.add(0);
        list.add(1);
        double tmp =1;
        tmp = list.get(0).intValue()+list.get(1).intValue();
        for (int i = 2; i < list.size(); i++) {
            tmp=list.get(i-1).intValue()+list.get(i-2).intValue();
       //     tmp = list.add((int) tmp);
            System.out.print(tmp+" ");
        }

        System.out.println(tmp);

    }
}
