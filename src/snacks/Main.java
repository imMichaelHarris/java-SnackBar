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

         //Snacks
         //Food vending machine
         Snack chips = new Snack("Chips", 36, 1.75, 1);
         Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
         Snack pretzel = new Snack("Pretzel", 36, 2.00, 1);

         //Drink vending machine
         Snack soda = new Snack("Soda", 24, 2.50, 2);
         Snack water = new Snack("Water", 20, 2.75, 2);
        System.out.println(jane.getName());
    }
}