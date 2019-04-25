package by.gsu.asoilab;

public class Musical implements Film,Object {
    private String instrument;
    private int numberofsongs;
    private String producer;
    private String audience;
    private double duration;

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

    Film[] films;

    @Override
    public void printInfo(Film[] ob) throws java.io.IOException {
        films = ob;
        for (Film  i:ob){
            if (i.getClass() == Musical.class)
            System.out.println(i);
        }
        System.out.println();
    }

    public Musical(String producer, String audience, double duration, String instrument, int numberofsongs){
        this.producer = producer;
        this.audience = audience;
        this.duration = duration;
        this.instrument = instrument;
        this.numberofsongs = numberofsongs;
    }

    public Musical(String producer, String audience, double duration, String instrument){
        this.producer = producer;
        this.audience = audience;
        this.duration = duration;
        this.instrument = instrument;
    }

    public Musical(){
    }

    @Override
    public void Name(){
        System.out.println("Белый лебедь");
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getNumberofsongs() {
        return numberofsongs;
    }

    public void setNumberofsongs(int numberofsongs) {
        this.numberofsongs = numberofsongs;
    }

    public String toString(){
        return getProducer()+";"+getAudience()+";"+getDuration()+";"+instrument+";"+numberofsongs;
    }
}
