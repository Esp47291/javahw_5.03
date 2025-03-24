import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3};

        double[] doubleArray = {1.57, 7.654, 9.986};

        String[] stringArray = {"Java", "Python", "C++"};

        System.out.println("Задача 2:");
        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        System.out.println("\nЗадача 3:");
        printArrayReversed(intArray);
        printArrayReversed(doubleArray);
        printArrayReversed(stringArray);

        System.out.println("\nЗадача 4:");
        makeAllEven(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    private static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static <T> void printArrayReversed(T[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void printArrayReversed(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void printArrayReversed(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void makeAllEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
    }
}