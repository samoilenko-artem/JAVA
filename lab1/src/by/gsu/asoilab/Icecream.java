package by.gsu.asoilab;

public class Icecream {
    private String name;
    private String chocolate;
    private int fat;

    public Icecream(String name, String chocolate, int fat){
        this.name = name;
        this.chocolate = chocolate;
        this.fat = fat;
    }

    public String getName(){
        return name;
    }

    public void setName(String last_name){
        this.name = name;
    }

    public String getChocolate(){
        return chocolate;
    }

    public void setAge(int age){
        this.chocolate = chocolate;
    }

    public int getFat (){
        return fat;
    }

    public void setFat(String sex){
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
