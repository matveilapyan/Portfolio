package Patterns.Behavioral.Command;

public class InsertCommand implements Command{
    Database database = new Database();

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
