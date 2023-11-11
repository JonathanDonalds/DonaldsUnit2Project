import java.util.Scanner;

public class LinearEquationLogic {

    public void start() {

    }

    public static void main(String[] args) {
        System.out.println("Welcome to the linear equation calculator!");
        boolean yesNoBoolean = true;
        while (yesNoBoolean) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter coordinate 1: ");
            String coordinate1 = scan.nextLine();
            System.out.print("Enter coordinate 2: ");
            String coordinate2 = scan.nextLine();
            System.out.println();
            LinearEquation object = new LinearEquation(Integer.parseInt(coordinate1.substring(1, 3)), Integer.parseInt(coordinate1.substring(5, 6)), Integer.parseInt(coordinate2.substring(1, 2)), Integer.parseInt(coordinate2.substring(4, 6)));
            System.out.println(object.lineInfo());
            System.out.print("Enter a value for x: ");
            double x = scan.nextDouble();
            System.out.println();
            System.out.println("The point on the line is " + object.coordinateForX(x));
            System.out.println();
            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            String yesNoString = scan.nextLine();
        }
    }
}
