
public class Main {

    // Рекурсивная функция для суммы массива
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0; // конец массива
        }
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = sumArray(numbers, 0);

        System.out.println("Sum = " + sum);
    }
}
