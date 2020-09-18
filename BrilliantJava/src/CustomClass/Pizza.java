package CustomClass;

public class Pizza {
    String size;
    int numCheeseTopping;
    int numPepperoniTopping;

    public void setPizzaInfo(String size, int numCheeseTopping, int numPepperoniTopping ){
        this.size = size;
        this.numCheeseTopping = numCheeseTopping;
        this.numPepperoniTopping = numPepperoniTopping;

    }
    public double calcCost(){
        int totalNumberOfTopping = numCheeseTopping + numPepperoniTopping;
        double totalPriceOfTopping = totalNumberOfTopping *2;
        double totalPrice = totalPriceOfTopping;

        if(size.equalsIgnoreCase("small") ){
            totalPrice += 10;
        }else if(size.equalsIgnoreCase("medium")){
            totalPrice += 12;
        }else{
            totalPrice += 14;
        }
        return totalPrice;
    }
    public String toString(){
        return "Size: "+size +"\nNumber of Cheese Topping: "+numCheeseTopping+ "\nNumber of Peperoni Topping: "+
                numPepperoniTopping+ "\n Total Price: "+calcCost();
    }
}
