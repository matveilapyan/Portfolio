package Cycles.OutputFigure;

public class OutputStars {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println();
            System.out.print("*"+" ");
            for (int j = 5; j > 1; j--) {
                System.out.print("*"+" ");
            }
        }
    }
}
