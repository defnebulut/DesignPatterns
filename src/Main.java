import java.util.Scanner;

/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 17.12.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Ice Cream Shop!!");
        int a = 0;

        IceCreamFactory factory = new TurkeyIceCreamFactory();
        IceCream iceCream = new TurkishVanillaIceCream();

        do {
            System.out.println("""
                    Which country flavor do you want to try? (Type the number only)
                    1:Turkish\s
                    2:Italian\s
                    3:Japanese
                    """);
            System.out.print("Your choice:");
            int selection = sc.nextInt();
            if (selection == 1) {
                a = 0;
                factory = new TurkeyIceCreamFactory();
            } else if (selection == 2) {
                a = 0;
                factory = new ItalyIceCreamFactory();
            } else if (selection == 3) {
                a = 0;
                factory = new JapanIceCreamFactory();
            } else {
                a++;
                System.out.println("Invalid choice\n");
            }
        } while (a > 0);

        a = 0;

        do {
            System.out.println("""
                    Which flavor do you want to try? (Type the number only)
                    1:Chocolate\s
                    2:Vanilla\s
                    3:Strawberry
                    4:Lemon
                    """);
            System.out.print("Your choice:");
            int selection = sc.nextInt();
            if (selection == 1) {
                a = 0;
                iceCream = factory.orderIceCream("Chocolate");
            } else if (selection == 2) {
                a = 0;
                iceCream = factory.orderIceCream("Vanilla");
            } else if (selection == 3) {
                a = 0;
                iceCream = factory.orderIceCream("Strawberry");
            } else if (selection == 4) {
                a = 0;
                iceCream = factory.orderIceCream("Lemon");
            } else {
                a++;
                System.out.println("Invalid choice\n");
            }
        } while (a > 0);
        sc.nextLine();
        System.out.println("Do you want extra condiments? (y or n)");
        String select = sc.nextLine();
        if (select.equals("y") || select.equals("Y")) {
            int selection;
            do {
                System.out.println("""
                                                
                        Which condiments do you want to try?
                        (Type the number only)
                        1:Chocolate Ball\s
                        2:Vanilla Ball\s
                        3:Strawberry Ball
                        4:LemonBall
                        5:Caramel Sauce
                        6:Hot Chocolate
                        7:Sprinkles
                        -1:To Exit""");
                System.out.print("Your choice:");
                selection = sc.nextInt();
                if (selection == 1) {
                    iceCream = new ChocolateBall(iceCream);
                    System.out.println(iceCream.getDescription());
                } else if (selection == 2) {
                    iceCream = new VanillaBall(iceCream);
                    System.out.println(iceCream.getDescription());
                } else if (selection == 3) {
                    iceCream = new StrawberryBall(iceCream);
                    System.out.println(iceCream.getDescription());
                } else if (selection == 4) {
                    iceCream = new LemonBall(iceCream);
                    System.out.println(iceCream.getDescription());
                } else if (selection == 5) {
                    iceCream = new CaramelSauce(iceCream);
                    System.out.println(iceCream.getDescription());
                } else if (selection == 6) {
                    iceCream = new HotChocolate(iceCream);
                    System.out.println(iceCream.getDescription());
                } else if (selection == 7) {
                    iceCream = new Sprinkles(iceCream);
                    System.out.println(iceCream.getDescription());
                } else if (selection != -1) {
                    System.out.println("Invalid choice\n");
                }
            } while (selection != -1);
        }
        System.out.println("\nYour order: " + iceCream.getDescription()
                + ".\nIt costs $" + iceCream.cost());
        System.out.println("Bon Appetit!");
    }
}