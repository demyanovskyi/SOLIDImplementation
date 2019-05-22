package liskovSubstitution;

public class Main {


    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee();
        SuperCoffeeMachine superCoffeeMachine = new SuperCoffeeMachine();
        superCoffeeMachine.makeCoffee();
        Barista barista = new Barista();
        barista.makeCoffee(new CoffeeMachine());
        barista.makeCoffee(superCoffeeMachine);
    }
}
