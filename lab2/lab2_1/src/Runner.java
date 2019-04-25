import by.gsu.asoilab.Film;
import by.gsu.asoilab.Cartoon;
import by.gsu.asoilab.Historical;
import by.gsu.asoilab.Musical;

public class Runner {
    public static void main(String[] args) {
        Film[] films = {
                new Cartoon("Фамнок", "12+", 1.4, "Базарин", "Компьютерный"),
        new Musical("Гагарина", "4+", 2.30, "", 2),
        new Historical("Ленина", "18+", 2, "Средневековье", "Частичная")
        };
        for(Film i:films){
            System.out.println(i);
        }
    }
}
