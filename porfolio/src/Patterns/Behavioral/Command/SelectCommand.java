package Patterns.Behavioral.Command;

public class SelectCommand implements Command{
    Database database = new Database();

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
