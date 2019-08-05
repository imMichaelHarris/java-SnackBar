package snacks;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash){
        maxId++
        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    public getName(){
        return name;
    }
    public setName(String name){
        this.name = name;
    }
}