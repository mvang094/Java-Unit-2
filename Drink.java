public class Drink {
    double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void type(){
        System.out.println("A bottle of water");
    }
}

class Soda extends Drink {
    public void type(){
        System.out.println("A bottle of soda");
    }
}

class Milk extends Drink {
    public void type(){
        System.out.println("A bottle of milk");
    }
}