package by.gsu.asoilab.Cartoons;
import by.gsu.asoilab.Film;

import by.gsu.asoilab.Cartoon;

public class Original extends Cartoon {
        private String painter;
        private String style;
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
                if (i.getClass() == Original.class) {
                    System.out.println(i.Name());
                    System.out.println(i);
                }
            }
            System.out.println();
        }

        public Original(String producer, String audience, double duration, String style, String painter){
            this.producer = producer;
            this.audience = audience;
            this.duration = duration;
            this.style = style;
            this.painter = painter;
        }

        public Original(String producer, String audience, double duration, String style){
            this.producer = producer;
            this.audience = audience;
            this.duration = duration;
            this.style = style;
        }

        public Original(){
        }

        @Override
        public String Name(){
            return "3 волка";
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
