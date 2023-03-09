public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota Corolla", 180);
        Car mazda = new Car("Mazda 6", 200);

        if (toyota._maxSpeed > mazda._maxSpeed) {
            System.out.print(toyota._name + " is faster");
        } else {
            System.out.print(mazda._name + " is faster");
        }
    }
}

