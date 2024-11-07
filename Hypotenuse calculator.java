import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter X: ");
        x = input.nextDouble();
        System.out.print("Enter Y: ");
        y = input.nextDouble();

        z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("The hypotenuse is: " + z);

        input.close();
    }
}
