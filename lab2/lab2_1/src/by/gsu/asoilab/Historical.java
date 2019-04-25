package by.gsu.asoilab;

public class Historical extends Film {
    private String historicalperiod;
    private String degreeofcompliance;

    public Historical(String producer, String audience, double duration, String historicalperiod, String degreeofcompliance){
        super(producer, audience, duration);
        this.historicalperiod = historicalperiod;
        this.degreeofcompliance = degreeofcompliance;
    }

    public Historical(String producer, String audience, double duration, String historicalperiod){
        super(producer, audience, duration);
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
        return super.toString()+";"+historicalperiod+";"+degreeofcompliance;
    }
}
