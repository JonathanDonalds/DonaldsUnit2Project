public class LinearEquationRunner {
    public static void main(String[] args) {
        /*LinearEquationLogic unit2Project = new LinearEquationLogic();
        unit2Project.start();*/
        int x1 = -2;
        int y1 = -2;
        int x2 = 4;
        int y2 = 4;
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.equation());
        System.out.println("Slope: " + equation.slope());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println("Distance: " + equation.distance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();
        double testX = 4;
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));
    }
}