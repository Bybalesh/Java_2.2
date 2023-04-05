public class Main {
    public static void main(String[] args) {

        int onAccount = 100; // Начальная сумма на счете;
        int summ = 1001; //Сумма пополнения;
        int bonus; //количество рассчитанных бонусов;
        int result; //Итоговая сумма на счету клиента;
        if (summ > 1000) {
            bonus = (summ / 100);
        } else {
            bonus = 0;
        }
        result = onAccount + summ + bonus;
        System.out.println("Итоговая сумма на счету клиента = " + result);
    }
}
