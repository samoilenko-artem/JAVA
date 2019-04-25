package by.gsu.asoilab;

public class Cartoon extends Film {
    private String painter;
    private String style;

    public Cartoon(String producer, String audience, double duration, String painter, String style){
        super(producer, audience, duration);
        this.painter = painter;
        this.style = style;
    }

    public Cartoon(String producer, String audience, double duration, String painter){
        super(producer, audience, duration);
        this.painter = painter;
    }

    public Cartoon(){
    }

    public Cartoon(Cartoon ob){
        super(ob);
        painter = ob.painter;
        style = ob.style;
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
        return super.toString()+";"+painter+";"+style;
    }
}