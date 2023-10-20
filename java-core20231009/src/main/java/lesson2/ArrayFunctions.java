package lesson2;

public class ArrayFunctions {

    // Метод для подсчета количества четных элементов в массиве
    public static int countEvens(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Функция для нахождения разницы между максимальным и минимальным элементами массива
    public static int findDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    // Функция, возвращающая true, если в массиве есть два соседних элемента с нулевым значением
    public static boolean hasConsecutiveZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Count of evens: " + countEvens(new int[] {2, 1, 2, 3, 4}));  // Should return 3
        System.out.println("Max - Min: " + findDifference(new int[] {1, 5, 3, 9, 2}));  // Should return 8
        System.out.println("Has consecutive zeros: " + hasConsecutiveZeros(new int[] {0, 1, 0, 0, 3}));  // Should return true
    }
}
