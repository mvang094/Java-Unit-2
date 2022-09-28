import java.util.*;

public class Main {

    public static void main (String[] args) {

        String priceText;
        double price;
        Scanner input = new Scanner(System.in);
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();
        ArrayList<Drink> drinkMenu =  new ArrayList<>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing");
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        System.out.println("Here is the description for the red velvet cupcake. The description is as follows.\n How much would you charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        redVelvet.type();
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        System.out.println("Here is the description for the chocolate cupcake. The description is as follows.\n How much would you charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        chocolate.type();
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        System.out.println("We are in the middle of creating the drink menu. We currently have three drinks on the menu but we need to decide on pricing");
        System.out.println("We are deciding on the price for water. Here is the description:");
        water.type();

        System.out.println("How much would you like to charge for the drink? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        water.setPrice(price);

        System.out.println("Here is the description for the soda. The description is as follows.\n How much would you charge for the drink? (Input a numerical number taken to 2 decimal places)");
        soda.type();
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        System.out.println("Here is the description for milk. The description is as follows.\n How much would you charge for the drink? (Input a numerical number taken to 2 decimal places)");
        milk.type();
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupcakeMenu, drinkMenu);
    }
}
