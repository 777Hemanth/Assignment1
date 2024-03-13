public class SimpleSum {
    public static void main(String[] args) {
        int[] numbers = {100, 52, 43, 99, 42, 40, 91};
        int sum = 0;
        for (int number : numbers) {
            if (number % 10 == 0) {
                sum = sum + number;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}

