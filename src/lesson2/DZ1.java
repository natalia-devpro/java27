package lesson2;

public class DZ1 {
    public static void main(String[] args) {
        int money = 1054;
        int pizzaCost = 230;
        int bobleCost = 26;
        double candyCost = 2.5;

        int canByPizza = money / pizzaCost;
        money = money - (pizzaCost * canByPizza);

        int canByBoble = money / bobleCost;
        money = money - (bobleCost * canByBoble);

        int canByCandy = (int)(money / candyCost);
        double zdacha = money - (canByCandy * candyCost);

        System.out.println("Пицц: " + canByPizza);
        System.out.println("Жвачки: " + canByBoble);
        System.out.println("Концеты: " + canByCandy);
        System.out.println("Сдача: " + zdacha);

    }
}
