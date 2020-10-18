import java.util.Locale;
import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public void inputPoint() {
        System.out.println("Podaj współrzedne X,Y dla układu współrzednych. Użyj przecinka jako separatora dla liczb "
                + "niecałkowitych.");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN);
        System.out.print("Podaj X=");
        x = scanner.nextDouble();
        //scanner.nextLine();
        System.out.print("Podaj Y=");
        y = scanner.nextDouble();
        scanner.nextLine();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
