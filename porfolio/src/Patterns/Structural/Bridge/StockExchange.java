package Patterns.Structural.Bridge;

public class StockExchange extends Figure{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developFigure() {
        System.out.println("Stock Exchange Development in progress...");
    }
}
