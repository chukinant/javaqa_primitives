public class Main {
    public static void main(String[] args) {
        System.out.println("Программа к задаче 1:");

        // Объявление переменной для хранения стоимости билета
        int ticketPrice = 48750;

        // Объявление переменной для хранения количества рублей для одной бонусной мили
        int earningThreshold = 20;

        // Расчет количества бонусных миль, используя значения заведённых переменных
        int bonusMiles = ticketPrice/earningThreshold;

        // Вывод на экран сообщения со стоимостью билета и количеством бонусных миль
        System.out.println("For ticket price of " + ticketPrice + " roubles, you get " + bonusMiles + " bonus miles");
    }
}