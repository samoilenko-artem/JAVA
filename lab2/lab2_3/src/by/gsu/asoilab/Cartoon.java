package by.gsu.asoilab;

import java.io.IOException;

abstract public class Cartoon implements Film,Object {
    private String painter;
    private String style;
    private String producer;
    private String audience;
    private double duration;

    public Cartoon(){
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

    @Override
    public String Name() {
        return null;
    }

    @Override
    public void printInfo(Film[] ob) throws IOException {

    }
}