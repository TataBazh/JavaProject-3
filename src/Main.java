public class Main {
    public static void main(String[] args) {
        System.out.println("Получи рубль за каждые 100!");

        System.out.println("Оператор дарит по 1 рублю за каждые 100 рублей пополнения, если вы пополните счет более " +
                "чем на 1000 рублей");
        System.out.println("Как это работает:");
        int a = 100;
        int b = a + 100;
        int d = 1100;

        int result;
        if (a < 100) {
            result = a + d + (d / 100);
        } else {
            result = a + d;
        }
        System.out.println(a + " рублей - начальная сумма на счете, при пополнении на 100 итоговая сумма на счете - " + b +
                ", бонусов нет");

        System.out.println("Если начальная сумма на счете меньше 100, при пополнении на 1000 итоговая сумма - " + (a + d));
        System.out.println((a) + " - начальная сумма на счете больше 100 рублей, при пополнении на сумму 1100 " +
                "бонус равен " + (d / 100) + " руб, " + "итоговая сумма на счету - " + (a + d + (d / 100)));
    }
}