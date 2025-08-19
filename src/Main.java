public class Main {
    public static void main(String[] args) {
        // Объявляем переменные
        int ticketPrice = 13675;     // Стоимость билета в рублях
        int milesPerRubles = 20;     // Количество рублей для начисления 1 мили

        // Рассчитываем количество бонусных миль
        // Используем целочисленное деление, чтобы отбросить дробную часть
        int bonusMiles = ticketPrice / milesPerRubles;

        // Выводим результат на экран
        System.out.println("Стоимость билета: " + ticketPrice + " рублей");
        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}
