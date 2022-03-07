package Patterns.Structural.Bridge;

public class Child extends Figure {

    protected Child(Developer developer) {
        super(developer);
    }

    @Override
    public void developFigure() {
        System.out.println("Child development in progress...");
        developer.drawFigure();
    }
}
