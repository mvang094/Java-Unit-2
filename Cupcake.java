public class Cupcake{
    double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void type(){
        System.out.println("A basic, generic cupcake with vanilla frosting");
//        System.out.println("classic");
    }
}

class RedVelvet extends Cupcake{
    public void type(){
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
        //System.out.println("red velvet");
    }
}
 class Chocolate extends Cupcake{
    public void type(){
        //System.out.println("chocolate");
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}