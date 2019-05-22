package liskovSubstitution;

public class Barista {
    public Barista() {
    }

    public void makeCoffee(CoffeeMachine coffeeMachine) {
        coffeeMachine.makeCoffee();
    }
}
