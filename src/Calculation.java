public class Calculation {

    public Calculation() {
    }

    public void showQuadrant(Point point){
    double x = point.getX();
    double y = point.getY();
    String quadrant = "żadnej";
    if ( x > 0 && y > 0){
        quadrant = "I";
    } else if (x < 0 && y > 0){
        quadrant = "II";
    } else if (x < 0 && y < 0){
        quadrant = "III";
    } else if (x > 0 && y < 0){
        quadrant = "IV";
    } else{
        System.out.println("Podane liczby nie spełniają warunku dla x i y różnego od zera.");
    }
    System.out.printf("Współrzedna (%.2f;%.2f) znajduje się w %s ćwiartce.", x, y, quadrant);
}
}
