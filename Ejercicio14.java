public class Ejercicio14 {
    public static void main(String[] args) {

        String[] array = { "? ", "? ", "? ", "? ", "? ", "? ", "? ", "? ", "? ", "? " };
        int x = (int) (Math.random() * 10);
        int input = -1;
        while (x != input) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
            input = Integer.parseInt(System.console().readLine("En que posicion crees que esta la x?"));
            input--;
            if (input < x) {
                array[input] = "> ";
            } else if (input > x) {
                array[input] = "< ";
            }
        }
        System.out.println("has ganado");
    }
}