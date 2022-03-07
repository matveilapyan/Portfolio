package Patterns.Structural.Bridge;

public abstract class Figure {
    protected Developer developer;
    protected Figure(Developer developer){
        this.developer = developer;
    }
    public abstract void developFigure();
}
