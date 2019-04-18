package by.gsu.asoilab;
public class Subject {
    private final static String NAME="wire";
    private Material material;
    private double VOLUME=0.03;

    public Subject(Material material) {
        this.material = material;

    }
    public String getName() {
        return NAME;
    }
    public Material getMaterial() {
        return material;
    }
    public double getVolume() {
        return VOLUME;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public double getMass(){
        return material.getDENSITY()*VOLUME;
    }
    public String toString(){
        return NAME + ";" + material + ";" + VOLUME + ";" + getMass();
    }
}
