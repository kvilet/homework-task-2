public class Main {

    public static void main(String[] args) {

        int account = 67; //баланс пользователя
        int refill = 1600; //сумма пополнения
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int amount = account + refill + bonus;
        System.out.println("Ваш баланс = " + amount + ". Количество зачисленных бонусов = " + bonus);
    }
}