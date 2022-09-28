import java.time.*;
import java.util.*;

public class Order {

    public Order (ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        String placeOrder;
        int orderChoice;
        Scanner input = new Scanner(System.in);
        ArrayList<Object> order = new ArrayList<>();

        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        placeOrder = input.nextLine();

        if (placeOrder.equalsIgnoreCase("y")) {
            order.add(LocalDate.now()); //Today's date
            order.add(LocalTime.now()); //Time now

            int itemNumber = 0;
            double subtotal = 0.00;
            boolean ordering = true;

            System.out.println("Here is the menu:");
            System.out.println("Cupcakes: ");

            for (Cupcake menu : cupcakeMenu) {
                itemNumber++;
                System.out.print(itemNumber + ": ");

                menu.type();
                System.out.println(menu.getPrice());
            }

            System.out.println("Drinks: ");

            for (Drink drinks : drinkMenu) {
                itemNumber++;
                System.out.print(itemNumber + ": ");

                drinks.type();
                System.out.println(drinks.getPrice());
            }

            while (ordering == true){
                System.out.println("What would you like to order? Please use the number associated with each item to order. Otherwise, type 0 to exit");
                orderChoice = input.nextInt();

                input.nextLine();

                if (orderChoice == 1){
                    order.add(cupcakeMenu.get(0));
                    cupcakeMenu.get(0).type();
                    System.out.println( "Added to order");
                }
                else if (orderChoice == 2){
                    order.add(cupcakeMenu.get(1));
                    cupcakeMenu.get(1).type();
                    System.out.println( "Added to order");
                }
                else if (orderChoice == 3){
                    order.add(cupcakeMenu.get(2));
                    cupcakeMenu.get(2).type();
                    System.out.println( "Added to order");
                }
                else if (orderChoice == 4){
                    order.add(drinkMenu.get(0));
                    drinkMenu.get(0).type();
                    System.out.println( "Added to order");
                }
                else if (orderChoice == 5){
                    order.add(drinkMenu.get(1));
                    drinkMenu.get(1).type();
                    System.out.println( "Added to order");
                }
                else if (orderChoice == 6){
                    order.add(drinkMenu.get(2));
                    drinkMenu.get(2).type();
                    System.out.println( "Added to order");
                }
                else {
                    System.out.println("Sorry, we do not seem to have that item on the menu");
                    System.out.println("Would you like to keep ordering?");
                    placeOrder = input.nextLine();

                    if (!(placeOrder.equalsIgnoreCase("Y"))){
                        ordering = false;
                    }
                }
            }
//            System.out.println(order.get(0));
//            System.out.println(order.get(1));

            for(int j = 2; j < order.size(); j++) {

                for (int k = 0; k < 3; k++) {
                    if (order.get(j) == cupcakeMenu.get(k)) {
                        cupcakeMenu.get(k).type();
                        System.out.println(cupcakeMenu.get(k).getPrice());
                        subtotal += cupcakeMenu.get(k).getPrice();
                    }
                    else if (order.get(j) == drinkMenu.get(k)) {
                        drinkMenu.get(k).type();
                        System.out.println(drinkMenu.get(k).getPrice());
                        subtotal += drinkMenu.get(k).getPrice();
                    }
                }

                System.out.println(subtotal);
            }
            new CreateFile();
            new WriteToClass(order);
        }
        else
            System.out.println("Have a nice day, then");
    }
}
