package snacks;

public class Main {

    public static void main(String[] args){
        //Customers 
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        //Vending Machinees
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office"); 
        System.out.println(jane.getName());
    }
}