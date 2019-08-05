package snacks;

public class VendingMachine{
    private static int maxid = 0;
    private int id;
    private String name;

    public VendingMachine(int id, String name){
        maxId++
        id = maxId;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}