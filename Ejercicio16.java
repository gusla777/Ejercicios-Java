public class Ejercicio16 {
    public static void main(String[] args) {

        int[][] array = new int[10][10];

        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int x = (int) (Math.random() * 2);
                array[i][j] = x;
                System.out.print((array[i][j]) + " ");

            }
            System.out.println();
        }
        for (int index = 0; index < array.length; index++) {
            int diagonal = index;
            suma += array[index][diagonal];
        }
        System.out.println();
        System.out.println(suma);
    }
}
