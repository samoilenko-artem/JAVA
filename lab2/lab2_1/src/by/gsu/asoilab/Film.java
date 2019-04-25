package by.gsu.asoilab;

public class Film {
    private String producer;
    private String audience;
    private double duration;

    public Film(){
    }

    public Film(String producer, String audience, double duration){
        this.producer = producer;
        this.audience = audience;
        this.duration = duration;
    }

    public Film(String producer, String audience){
        this.producer = producer;
        this.audience = audience;
    }

    public Film(Film ob){
        producer = ob.producer;
        audience = ob.audience;
        duration = ob.duration;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String toString() {
        return producer+";"+audience+";"+duration;
    }

    public void Name(){
    }
}

