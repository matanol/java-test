import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Toyota max speed:");
            int toyotaMaxSpeedInput = input.nextInt();

            System.out.println("Enter Mazda max speed:");
            int mazdaMaxSpeedInput = input.nextInt();

            Car toyota = new Car("Toyota Corolla", toyotaMaxSpeedInput);
            Car mazda = new Car("Mazda 6", mazdaMaxSpeedInput);

            if (toyota._maxSpeed > mazda._maxSpeed) {
                System.out.print(toyota._name + " is faster");
            } else {
                System.out.print(mazda._name + " is faster");
            }
        } catch (Exception e) {
            if (e instanceof InputMismatchException) {
                System.out.println("Wrong input type");
                main(new String[0]);

            } else {
                System.out.println(e);
                System.exit(1);
            }
        }

    }
}

