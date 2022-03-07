package Practice.Collection.TaskOne;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(13);
        arrayList.add(11);
        CreateDynamicsMassive createDynamicsMassive = new CreateDynamicsMassive();
        createDynamicsMassive.createDynamicMassive(arrayList);

        int a = arrayList.get(1);
        arrayList.remove(1);
        arrayList.add(1,2);
        arrayList.set(2,55);
        createDynamicsMassive.createDynamicMassive(arrayList);
    }
}
