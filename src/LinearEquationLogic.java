import java.util.Scanner;

public class LinearEquationLogic {
    LinearEquation object2 = new LinearEquation();

    public void start() {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the linear equation calculator!");
        System.out.print("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coordinate2 = scan.nextLine();
        System.out.println();
        System.out.println("The two points are: " + coordinate1 + " and " + coordinate2);
        System.out.println("The equation of the line between these points is:");
    }
}
