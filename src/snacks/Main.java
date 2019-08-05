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
         Snack chips = new Snack("Chips", 36, 1.75, food.getId());
         Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
         Snack pretzel = new Snack("Pretzel", 36, 2.00, food.getId());

         //Drink vending machine
         Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
         Snack water = new Snack("Water", 20, 2.75, drink.getId());


         //Processing

        System.out.println(jane.getCash());
        System.out.println(jane.buySnack(3, chips));
        System.out.println(jane.getCash());
    }
}