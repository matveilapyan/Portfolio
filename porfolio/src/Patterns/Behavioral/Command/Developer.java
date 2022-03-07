package Patterns.Behavioral.Command;

public class Developer {
    Command insert;
    Command delete;
    Command update;
    Command select;

    public Developer(Command insert, Command delete, Command update, Command select) {
        this.insert = insert;
        this.delete = delete;
        this.update = update;
        this.select = select;
    }

    public void insertRecord(){
        insert.execute();
    }
    public void updateRecord(){
        update.execute();
    }
    public void selectRecord(){
        select.execute();
    }
    public void deleteRecord(){
        delete.execute();
    }
}
