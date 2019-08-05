package snacks;

public class Snack {

    private static int maxid = 0;
    private int id;
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

    //methods
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public int getVendingId(){
        return vendingId;
    }
    public void setVendingId(int vendingId){
        this.vendingId = vendingId;
    }
    public int getQuanity(){
        return quanity;
    }
    public void addQuanity(int add){
        int newQuanity = this.quanity + add;
        this.quanity = newQuanity;
    }
    public void buySnack(int quanity){
        // this.quanity -= quanity;
        int newQuanity = this.quanity - quanity;
        this.quanity = newQuanity;
    }
    public double totalCost(int quanity){
        return this.cost * quanity; //should convert int to double maybe idk
    }
}