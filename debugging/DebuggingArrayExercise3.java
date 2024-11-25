public class DebuggingArrayExercise3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 40, 30};

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("El número más grande es: " + largest);
    }
}
