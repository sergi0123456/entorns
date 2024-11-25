public class DebuggingExercise2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Error al calcular el promedio de cada fila
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            double average = sum / matrix[i].length;  // Error de división entera
            System.out.println("Promedio de la fila " + i + ": " + average);
        }
    }
}
