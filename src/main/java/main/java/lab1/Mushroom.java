package main.java.lab1;

public class Mushroom{
    public int size;
    public String type;

    public Mushroom(int size, String type){
        this.size = size;
        this.type = type;
    }

    public Mushroom grow(){
        this.size += 5;
        return this;
    }
}