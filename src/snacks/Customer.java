package snacks;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash){
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    public void addCash(double cash){
        this.cash += cash;
    }
    public String buySnack(int quanity, Snack snack){
        //having the void type and not returning didn't work here - gave error when compiling
        this.cash -= snack.totalCost(quanity);
        return this.name + " buys " + quanity + " " + snack.getName() + "\n" +
            this.name + " has " + getCash() + " left.";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getCash(){
        return cash;
    }
}