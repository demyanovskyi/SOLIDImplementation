package interfaceSegregation;

public class Plane implements   FlyAbility, RideAbility {
    public Plane() {
    }

    public void fly() {
        System.out.println("plane is flying");
    }

    public void ride() {
        System.out.println("plane is going");
    }
}
