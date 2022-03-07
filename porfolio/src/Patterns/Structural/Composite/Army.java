package Patterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Officers> officers = new ArrayList<Officers>();

    public void addOfficers(Officers officer){
        officers.add(officer);
    }
    public void removeOfficer(Officers officer){
        officers.remove(officer);
    }
    public void createTactic(){
        System.out.println("Army creates tactics...\n");
        for (Officers of:officers) {
            of.createTactic();
        }
    }
}
