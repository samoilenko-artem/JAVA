package by.gsu.asoilab;

public class Musical extends Film {
    private String instrument;
    private int numberofsongs;

    public Musical(String producer, String audience, double duration, String instrument, int numberofsongs){
        super(producer, audience, duration);
        this.instrument = instrument;
        this.numberofsongs = numberofsongs;
    }

    public Musical(String producer, String audience, double duration, String instrument){
        super(producer, audience, duration);
        this.instrument = instrument;
    }

    public Musical(){
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
        return super.toString()+";"+instrument+";"+numberofsongs;
    }
}
