public class Ejercicio15 {
    public static void main(String[] args) {
        int array [][] = {{0,0,0},{0,0,0},{0,0,0}};
        int x = (int) (Math.random() * 5);
        int y = (int) (Math.random() * 5);
        array[x][y]=1;

        for ( int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
