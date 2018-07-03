
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Scanner scanner = new Scanner(System.in);
        Pizza pizza;

        System.out.println("Please insert pizza number");
        System.out.println("1. Margherita");
        System.out.println("2. Havaiian");
        System.out.println("3. Funghi");

        int choseNumber = scanner.nextInt();

        switch (choseNumber) {
            case 1:
                waiter.setPizzaBuilder(new MargheritaPizzaBuilder());
                pizza = waiter.getPizza();
                break;
            case 2:
                waiter.setPizzaBuilder(new HavaiianPizzaBuilder());
                pizza = waiter.getPizza();
                break;
            case 3:
                waiter.setPizzaBuilder(new FunghiPizzaBuilder());
                pizza = waiter.getPizza();
                break;
            default:
                pizza = waiter.getPizza();
        }

        System.out.println("This is pizza on: " + pizza);
    }
}
