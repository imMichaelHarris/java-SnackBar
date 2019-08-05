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

        //1
        System.out.println(jane.buySnack(3, soda));
        //2
        System.out.println(jane.buySnack(1, pretzel));
        //3
        System.out.println(bob.buySnack(2, soda));
        //4
        System.out.println(bob.addCash(10.00));
        System.out.println(bob.getCash() + " left.");
        //5
        System.out.println(jane.buySnack(1, chocolateBar));
        //6
        System.out.println(pretzel.addQuanity(12));
        System.out.println(pretzel.getQuanity());
    }
}