import java.util.Scanner;

class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than or equal to 212: ");
        double temp = scanner.nextDouble();

        if (temp >= 212) {
            System.out.println("Water is boiling!");
        } else {
            System.out.println("Water is not boiling.");
        }

        scanner.close();
    }
}
