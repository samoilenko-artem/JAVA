import by.gsu.asoilab.Icecream;

import java.util.Arrays;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Icecream[] icecreams = {
                new Icecream("Top", false,  8),
                new Icecream("Saletto", false, 9),
                new Icecream("20copeec", false, 8),
                new Icecream("Yukki", true, 11),
                new Icecream("28copeec", true, 12),
                new Icecream("Kapriz", true, 12),
                new Icecream("Gosha", true,13),
                new Icecream("Frudoza", false, 5),
                new Icecream("Pingvin", false, 8),
                new Icecream("Fiesta", true, 14),
        };

        System.out.println("\tOriginal array:\n");
        show(icecreams);

        Arrays.sort(icecreams, new Comparator<Icecream>() {
            @Override
            public int compare(Icecream o1, Icecream o2) {
                return o1.getFat() - o2.getFat();
            }
        });
        System.out.println("\tSort by fat:\n");
        show(icecreams);

        Arrays.sort(icecreams, new Comparator<Icecream>() {
            @Override
            public int compare(Icecream o1, Icecream o2)
            {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("\tSort by name:\n");
        show(icecreams);

        System.out.println("\tNumber of chocolate icecreams = "+countChocolate(icecreams));
    }

    private static void show(Icecream[] array){
        for (Icecream item : array){
            System.out.println(item + "\n");
        }
    }

    private static int countChocolate(Icecream[] array){
        int num = 0;
        for (Icecream item : array){
            if (item.getChocolate()){
                num++;
            }
        }
        return num;
    }
}
