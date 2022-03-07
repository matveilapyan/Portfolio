package Patterns.Structural.Bridge;

public class CircleDeveloper implements Developer{
    @Override
    public void drawFigure() {
        System.out.println("Drawing circle...");
    }
}
