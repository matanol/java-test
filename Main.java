import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Toyota max speed:");

        String toyotaMaxSpeedInput = input.nextLine();

        System.out.println("Enter Mazda max speed:");
        String mazdaMaxSpeedInput = input.nextLine();


        Car toyota = new Car("Toyota Corolla", Integer.parseInt(toyotaMaxSpeedInput));
        Car mazda = new Car("Mazda 6", Integer.parseInt(mazdaMaxSpeedInput));

        if (toyota._maxSpeed > mazda._maxSpeed) {
            System.out.print(toyota._name + " is faster");
        } else {
            System.out.print(mazda._name + " is faster");
        }
    }
}

