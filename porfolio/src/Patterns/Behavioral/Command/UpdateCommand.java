package Patterns.Behavioral.Command;

public class UpdateCommand implements Command{
    Database database = new Database();
    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
