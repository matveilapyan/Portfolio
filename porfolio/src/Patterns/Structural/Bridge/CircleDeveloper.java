package Patterns.Structural.Bridge;

public class JavaDeveloper implements Developer{
    @Override
    public void drawFigure() {
        System.out.println("Drawing circle...");
    }
}
