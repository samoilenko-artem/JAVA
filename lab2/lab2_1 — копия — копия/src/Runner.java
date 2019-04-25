import by.gsu.asoilab.Cartoons.Original;
import by.gsu.asoilab.Cartoons.Translated;
import by.gsu.asoilab.Film;
import by.gsu.asoilab.Historical;
import by.gsu.asoilab.Musical;

public class Runner {
    public static void main(String[] args) throws java.io.IOException {
        Film[] films = {
                new Original("Фамнок", "12+", 1.4, "Компьюетрный", "Базарин"),
                new Translated("Емельненко", "14+", 1.9, "Классический", "Цыркулин"),
        new Musical("Гагарина", "4+", 2.30, "Скрипка", 2),
        new Historical("Ленина", "18+", 2, "Средневековье", "Частичная")
        };
        for(Film i:films){
            i.printInfo(films);
        }
    }
}
