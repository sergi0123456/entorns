import java.util.Arrays;

public class DebuggingArrayExercise5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 3};

        int uniqueCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                numbers[uniqueCount++] = numbers[i];
            }
        }

        numbers = Arrays.copyOf(numbers, uniqueCount);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
