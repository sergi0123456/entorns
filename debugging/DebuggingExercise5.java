public class DebuggingExercise5 {
    public static void main(String[] args) {
        String[][] matrix = new String[3][3];

        // Error: no se inicializa correctamente la matriz de objetos
        matrix[0][0] = "Hola";
        matrix[0][1] = "Mundo";
        matrix[1][0] = "Java";
        matrix[1][1] = "Debugging";

        // Intento de acceder a una posición no inicializada
        System.out.println("Valor en [2][2]: " + matrix[2][2]);
    }
}
