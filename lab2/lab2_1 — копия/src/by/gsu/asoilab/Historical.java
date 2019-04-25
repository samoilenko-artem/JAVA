package by.gsu.asoilab;

public class Historical implements Film,Object {
    private String historicalperiod;
    private String degreeofcompliance;
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
            if (i.getClass() == Historical.class)
            System.out.println(i);
        }
        System.out.println();
    }

    public Historical(String producer, String audience, double duration, String historicalperiod, String degreeofcompliance){
        this.producer = producer;
        this.audience = audience;
        this.duration = duration;
        this.historicalperiod = historicalperiod;
        this.degreeofcompliance = degreeofcompliance;
    }

    public Historical(String producer, String audience, double duration, String historicalperiod){
        this.producer = producer;
        this.audience = audience;
        this.duration = duration;
        this.historicalperiod = historicalperiod;
    }

    public Historical(){
    }

    @Override
    public void Name(){
        System.out.println("Троя");
    }

    public String getHistoricalperiod() {
        return historicalperiod;
    }

    public void setHistoricalperiod(String historicalperiod) {
        this.historicalperiod = historicalperiod;
    }

    public String getDegreeofcompliance() {
        return degreeofcompliance;
    }

    public void setDegreeofcompliance(String degreeofcompliance) {
        this.degreeofcompliance = degreeofcompliance;
    }

    public String toString(){
        return getProducer()+";"+getAudience()+";"+getDuration()+";"+historicalperiod+";"+degreeofcompliance;
    }
}
