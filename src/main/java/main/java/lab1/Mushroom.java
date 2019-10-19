package main.java.lab1;

public class Mushroom extends Plant{
    public int height;
    public String type;

    public Mushroom(int size, String type){
        super(size, "No color", 0);
        this.type = type;
    }

    public Mushroom grow(){
        this.height += 5;
        return this;
    }
}