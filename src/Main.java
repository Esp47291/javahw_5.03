import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Объявление массивов
        // Массив 1: Целочисленный массив, созданный через new
        int[] intArray = new int[]{1, 2, 3};

        // Массив 2: Массив дробных чисел, сразу заполненный значениями
        double[] doubleArray = {1.57, 7.654, 9.986};

        // Массив 3: Произвольный массив (например, строковый)
        String[] stringArray = {"Java", "Python", "C++"};

        // Задача 2: Вывод элементов массивов по порядку
        System.out.println("Задача 2:");
        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        // Задача 3: Вывод элементов массивов в обратном порядке
        System.out.println("\nЗадача 3:");
        printArrayReversed(intArray);
        printArrayReversed(doubleArray);
        printArrayReversed(stringArray);

        // Задача 4: Преобразование нечетных чисел в четные
        System.out.println("\nЗадача 4:");
        makeAllEven(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    // Метод для вывода элементов массива по порядку через запятую
    private static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Перегруженный метод для целочисленного массива
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Перегруженный метод для массива дробных чисел
    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Метод для вывода элементов массива в обратном порядке через запятую
    private static <T> void printArrayReversed(T[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Перегруженный метод для целочисленного массива
    private static void printArrayReversed(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Перегруженный метод для массива дробных чисел
    private static void printArrayReversed(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // Метод для преобразования нечетных чисел в четные
    private static void makeAllEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
    }
}