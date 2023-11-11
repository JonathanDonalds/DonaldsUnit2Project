import java.util.Scanner;

public class LinearEquationLogic {

    public void start() {
        welcome();
    }

    private void welcome() {
        System.out.println("Welcome to the linear equation calculator!");
        CoordinatesAndInfo();
    }

    private void CoordinatesAndInfo() {
        boolean yesNoBoolean = true;
        while (yesNoBoolean) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter coordinate 1: ");
            String coordinate1 = scan.nextLine();
            System.out.print("Enter coordinate 2: ");
            String coordinate2 = scan.nextLine();
            System.out.println();
            coordinate1 = coordinate1.substring(1, coordinate1.indexOf(",")) + coordinate1.substring(coordinate1.indexOf(",") + 1, coordinate1.length() - 1);
            coordinate2 = coordinate2.substring(1, coordinate2.indexOf(",")) + coordinate2.substring(coordinate2.indexOf(",") + 1, coordinate2.length() - 1);
            int x1 = Integer.parseInt(coordinate1.substring(0, coordinate1.indexOf(" ")));
            int y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(" ") + 1));
            int x2 = Integer.parseInt(coordinate2.substring(0, coordinate2.indexOf(" ")));
            int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(" ") + 1));
            LinearEquation object = new LinearEquation(x1, y1, x2, y2);
            if (x1 == x2) {
                System.out.println("These points are on a vertical line: x = " + x1);
            } else {
                System.out.println(object.lineInfo());
                System.out.println();
                System.out.print("Enter a value for x: ");
                double x = scan.nextDouble();
                scan.nextLine();
                System.out.println();
                System.out.println("The point on the line is " + object.coordinateForX(x));
            }
            System.out.println();
            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            String yesNoString = scan.nextLine();
            if (yesNoString.equals("n")) {
                yesNoBoolean = false;
                goodbye();
            }
        }
    }
    private void goodbye() {
        System.out.print("Thank you for using the slope calculator, goodbye!");
    }
}