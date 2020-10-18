import java.util.Scanner;

public class CoordinateSystem {
    public static void main(String[] args) {
        Point point = new Point();
        point.inputPoint();
        Calculation calculation = new Calculation();
        calculation.showQuadrant(point);
    }
}
