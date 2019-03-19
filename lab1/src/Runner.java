import by.gsu.asoilab.Icecream;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Icecream[] icecreams = {
                new Icecream("Top", "no",  8),
                new Icecream("Saletto", "no", 9),
                new Icecream("20copeec", "no", 8),
                new Icecream("Yukki", "yes", 11),
                new Icecream("28copeec", "yes", 12),
                new Icecream("Kapriz", "yes", 12),
                new Icecream("Gosha", "yes",13),
                new Icecream("Frudoza", "no", 5),
                new Icecream("Pingvin", "no", 8),
                new Icecream("Fiesta", "yes", 14),
        };
        //Вывод исхдного массива
        System.out.println("\tOriginal array:");
        for (Icecream item : icecreams){
            item.show();
            System.out.println();
        }
        //Сортировка массива в порядке возрастания(число)
        Arrays.sort(icecreams, new Comparator<Icecream>() {
            @Override
            public int compare(Icecream o1, Icecream o2){
                return o1.getFat() - o2.getFat();
            }
        });
        System.out.println("\tSort by fat:");
        for (Icecream item : icecreams){
            item.show();
            System.out.println();
        }
        //Сортирока по алфавиту
        Arrays.sort(icecreams, new Comparator<Icecream>() {
            @Override
            public int compare(Icecream o1, Icecream o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("\tSort by name:");
        for (Icecream item : icecreams){
            item.show();
            System.out.println();
        }

        float avg_fat = 0;
        for (Icecream item : icecreams){
            avg_fat += item.getFat();
        }
        System.out.println("Average fat: "+avg_fat/10);
        int chocolate_count = 0;
        for (Icecream item : icecreams){
            if(item.getChocolate() == "yes"){
                chocolate_count++;
            }
        }
        System.out.println("Number of chocolate icecreams: "+chocolate_count);
    }
}
