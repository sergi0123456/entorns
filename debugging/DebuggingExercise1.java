public class DebuggingExercise1 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        // Error en el bucle de suma: debe ser sumados los elementos de todas las filas y columnas
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        // Mostrar la suma total
        System.out.println("La suma de los elementos de la matriz es: " + sum);
    }
}
