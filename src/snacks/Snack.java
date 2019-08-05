package snacks;

public class Snack {

    private static int maxid = 0;
    private String name;
    private int quanity;
    private double cost;
    private int vendingId;

    //this is a constructor which will be called when we initiate a new object from this claass i.e. "new Snack()"

    public Snack(String name, int quanity, double cost, int vendingId){
        maxid++;

        id = maxid;
        this.name = name;
        this.quanity = quanity;
        this.cost = cost;
        this.vendingId = vendingId;
    }
}