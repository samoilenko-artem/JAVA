package by.gsu.asoilab;

public class Icecream {
    private String name;
    private boolean chocolate;
    private int fat;

    public Icecream(String name, boolean chocolate, int fat){
        this.name = name;
        this.chocolate = chocolate;
        this.fat = fat;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getChocolate(){
        return chocolate;
    }

    public void setChocolate(boolean chocolate){
        this.chocolate = chocolate;
    }

    public int getFat (){
        return fat;
    }

    public void setFat(int fat){
        this.fat = fat;
    }
    public void show(){
        System.out.println("Name : "+name+"\nChocolate : "+chocolate+"\nFat : "+fat);
    }
    @Override
    public String toString(){
        return name+";"+chocolate+";"+fat;
    }
}
