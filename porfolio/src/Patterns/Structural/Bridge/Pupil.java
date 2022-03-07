package Patterns.Structural.Bridge;

public class Pupil extends Figure{

    protected Pupil(Developer developer) {
        super(developer);
    }

    @Override
    public void developFigure() {
        System.out.println("Pupil development in progress...");
        developer.drawFigure();
    }
}
