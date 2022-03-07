package Patterns.Structural.Bridge;

public class FigureCreator {
    public static void main(String[] args) {
        Figure [] figures = {
                new Child(new CircleDeveloper()),
                new Pupil(new SquareDeveloper())
        };
        for (Figure fig: figures) {
            fig.developFigure();
        }
    }
}
