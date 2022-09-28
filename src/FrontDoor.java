public class FrontDoor {
    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 5;

        SlopeCalculator calc = new SlopeCalculator();
        int x2 = calc.square(x1);
        int y2 = calc.square(y1);

        double slope = calc.slope(x1, y1, x2, y2);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
        System.out.println("y1 = " + y1 + ", y2 = " + y2);
        System.out.println("slope = " + slope);
    }
}
