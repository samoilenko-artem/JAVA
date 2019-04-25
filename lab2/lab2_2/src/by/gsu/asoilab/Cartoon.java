package by.gsu.asoilab;

import java.io.IOException;

public class Cartoon implements Film,Object {
    private String painter;
    private String style;
    private String producer;
    private String audience;
    private double duration;

    Film[] films;

    @Override
    public void printInfo(Film[] ob) throws java.io.IOException {
        films = ob;
        for (Film  i:ob){
            if (i.getClass() == Cartoon.class)
            System.out.println(i);
        }
        System.out.println();
    }

    @Override
    public String getProducer() {
        return producer;
    }

    @Override
    public String getAudience() {
        return audience;
    }

    @Override
    public double getDuration() {
        return duration;
    }

    public Cartoon(String producer, String audience, double duration, String painter, String style){
        this.producer = producer;
        this.audience = audience;
        this.duration = duration;
        this.painter = painter;
        this.style = style;
    }

    public Cartoon(String producer, String audience, double duration, String painter){
        this.producer = producer;
        this.audience = audience;
        this.duration = duration;
        this.painter = painter;
    }

    public Cartoon(){
    }

    public void Name(){
        System.out.println("НУ погоди!");
    }

    public String getPainter() {
        return painter;
    }

    public void setPainter(String painter) {
        this.painter = painter;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String toString(){
        return getProducer()+";"+getAudience()+";"+getDuration()+";"+painter+";"+style;
    }
}