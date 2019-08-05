package snacks;

public class VendingMachine{
    private int id;
    private String name;

    public VendingMachine(int id, String name){
        this.id = id;
        this.name = name;
    }

    public getId(){
        return id;
    }
    public setId(int id){
        this.id = id;
    }
    public getName(){
        return name;
    }
    public setName(String name){
        this.name = name;
    }
}