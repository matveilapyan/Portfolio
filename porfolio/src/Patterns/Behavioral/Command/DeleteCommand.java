package Patterns.Behavioral.Command;

public class DeleteCommand implements Command{
    Database database = new Database();

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
