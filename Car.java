public class Car {
    String _name;
    int _maxSpeed;

    enum Type {
        PRIVATE, SUV, SPORT
    }

    Type type;

    public Car(String name, int maxSpeed) {
        _name = name;
        _maxSpeed = maxSpeed;
    }

}
