package snacks;

public class Main {

    public static void main(String[] args){
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        System.out.println(jane.getName());
    }
}