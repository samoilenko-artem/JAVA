import by.gsu.asoilab.Material;
import by.gsu.asoilab.Subject;

public class Runner {
    public static void main(String[] args) {
        Subject wire=new Subject(Material.STEEL);
        System.out.println(wire);
        wire.setMaterial(Material.COPPER);
        System.out.println("The wire mass is " + wire.getMass()+" kg ");
    }
}
