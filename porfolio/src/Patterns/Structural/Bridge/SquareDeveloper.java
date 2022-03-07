package Patterns.Structural.Bridge;

public class SquareDeveloper implements Developer{
    @Override
    public void drawFigure() {
        System.out.println("Drawing square...");
    }
}
