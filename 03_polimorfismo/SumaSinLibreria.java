public class SumaSinLibreria {
    public static void main(String[] args) {
        // Convertir los argumentos de la línea de comandos a números enteros
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Realizar la suma
        int resultado = num1 + num2;

        // Imprimir el resultado por pantalla
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
    }
}