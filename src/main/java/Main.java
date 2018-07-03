
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert pizza number");
        System.out.println("1. Margherita");
        System.out.println("2. Havaiian");
        System.out.println("3. Funghi");

        int choseNumber = scanner.nextInt();

        switch (choseNumber) {
            case 1:
                waiter.setPizzaBuilder(new MargheritaPizzaBuilder());
                break;
            case 2:
                waiter.setPizzaBuilder(new HavaiianPizzaBuilder());
                break;
            case 3:
                waiter.setPizzaBuilder(new FunghiPizzaBuilder());
                break;
        }

        System.out.println("This is pizza on: " + waiter.getPizza());
    }
}
