public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1:");
        int targetAmount = 2_459_000; // Целевая сумма
        int savingsPerMonth = 15_000; // Ежемесячный взнос
        int currentAmount = 0; // Текущая сумма
        int months = 0; // Счетчик месяцев

        while (currentAmount < targetAmount) {
            months++;
            currentAmount += savingsPerMonth;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + currentAmount + " рублей");
        }

        // Задача 2
        System.out.println("\nЗадача 2:");
        int i = 1;

        // Вывод чисел от 1 до 10 с помощью цикла while
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(); // Переход на новую строку

        // Вывод чисел от 10 до 1 с помощью цикла for
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println(); // Переход на новую строку

        // Задача 3
        System.out.println("\nЗадача 3:");
        int population = 12_000_000; // Население
        double birthRate = 17.0 / 1000; // Рождаемость
        double deathRate = 8.0 / 1000; // Смертность
        int years = 10; // Количество лет

        for (int year = 1; year <= years; year++) {
            population += (int)(population * (birthRate - deathRate));
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        // Задача 4
        System.out.println("\nЗадача 4:");
        double initialDeposit = 15_000; // Первоначальная сумма
        double targetDeposit = 12_000_000; // Целевая сумма
        double interestRate = 0.07; // Процентная ставка
        months = 0; // Сброс счетчика месяцев

        while (initialDeposit < targetDeposit) {
            months++;
            initialDeposit += initialDeposit * interestRate;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + (int)initialDeposit + " рублей");
        }

        // Задача 5
        System.out.println("\nЗадача 5:");
        initialDeposit = 15_000; // Сброс первоначальной суммы
        months = 0; // Сброс счетчика месяцев

        while (initialDeposit < targetDeposit) {
            months++;
            initialDeposit += initialDeposit * interestRate;

            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + (int)initialDeposit + " рублей");
            }
        }

        // Задача 6
        System.out.println("\nЗадача 6:");
        initialDeposit = 15_000; // Сброс первоначальной суммы
        int yearsToSave = 9; // Количество лет
        months = 0; // Сброс счетчика месяцев

        while (yearsToSave > 0) {
            months++;
            initialDeposit += initialDeposit * interestRate;

            if (months % 6 == 0) { // Каждые полгода
                System.out.println("Через " + months / 6 + " полугодий, сумма накоплений равна " + (int)initialDeposit + " рублей");
                yearsToSave -= 0.5; // Уменьшаем количество оставшихся лет
            }
        }

        // Задача 7
        System.out.println("\nЗадача 7:");
        int firstFriday = 5; // Первое число пятницы (например, 5)
        int daysInMonth = 31; // Количество дней в месяце

        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        // Задача 8
        System.out.println("\nЗадача 8:");
        int currentYear = 2023; // Текущий год
        int cometCycle = 79; // Цикл появления кометы
        int startYear = currentYear - 200; // Год 200 лет назад
        int endYear = currentYear + 100; // Год через 100 лет

        for (int year = startYear; year <= endYear; year++) {
            if ((year - startYear) % cometCycle == 0) {
                System.out.println(year);
            }
        }
    }
}