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
    public getId(){
        return id;
    }
    public getName(){
        return name;
    }
    public setName(String name){
        this.name = name;
    }
    public getCost(){
        return cost;
    }
    public setCost(double cost){
        this.cost = cost;
    }
    public getVendingId(){
        return vendingId;
    }
    public setVendingId(int vendingId){
        this.vendingId = vendingId;
    }
    public getQuanity(){
        return quanity;
    }
    public addQuanity(int add){
        int newQuanity = this.quanity + add;
        this.quanity = newQuanity;
    }
    public buySnack(int quanity){
        // this.quanity -= quanity;
        int newQuanity = this.quanity - quanity;
        this.quanity = newQuanity;
    }
    public totalCost(int quanity){
        return this.cost * quanity;
    }
}