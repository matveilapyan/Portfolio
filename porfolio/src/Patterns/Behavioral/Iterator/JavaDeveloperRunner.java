package Patterns.Iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java","Spring","Interface","Hibernate"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("AXY",skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer "+javaDeveloper.getName());
        System.out.println("Skills "+javaDeveloper.getName());
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString()+" ");
        }
    }
}
