import by.gsu.asoilab.Businesstrip;

public class Runner {

    public static void main(String[] args) {
        Businesstrip[] businesstrips = {
                new Businesstrip("Artem", 219, 4),
                new Businesstrip("Maxim",400,29),
                new Businesstrip("Veronika", 1235, 43),
                new Businesstrip("Stas", 1658, 99),
                new Businesstrip("Frank", 200, 9),
                new Businesstrip("Alice", 9100, 14),
        };
        for (Businesstrip item : businesstrips){
            item.show();
            System.out.println();
        }
        for (Businesstrip item: businesstrips){
            if (item.getDays() > 0 && item.getDays() < 10){
                System.out.println("Duration"+item.getDays());
            }
        }
        for (Businesstrip item : businesstrips){
            System.out.println(item);
            System.out.println();
        }
        int sum = 0;
        for (Businesstrip item : businesstrips){
            sum += item.getTotal();
        }
        System.out.println("Sum of the total expenses = "+ sum);
        Businesstrip max = businesstrips[0];
        for (Businesstrip item: businesstrips){
            if (item.getTotal() > max.getTotal()){
                max = item;
            }
        }
        System.out.println("Account with the max total = "+max.getAccount());
    }
}
