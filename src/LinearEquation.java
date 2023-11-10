public class LinearEquation {

    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0 ;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance() {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public double yIntercept() {
        return y1 - slope() * x1;
    }

    public double slope() {
        return (double) (y2 - y1) / (x2 - x1);
    }

    public String equation() {
        return "y = " + slope() + ("x + " + yIntercept());
    }

    public String coordinateForX(double x) {
        return "0";
    }

    public String lineInfo() {
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\n" + "The equation of the line between these points is: " + equation() + "\n" + "The slope of the line between these points is: " + slope() + "\n" + "The y-intercept of the line: " + yIntercept() + "\n" + "The distance between the two points is: " + distance() + "\n";
    }

    private double roundedToHundredth(double toRound) {
      return 0;
    }
}