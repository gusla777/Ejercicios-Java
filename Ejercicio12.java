public class Ejercicio12 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) Math.random() * 101;
        }
        int num = Integer.parseInt(System.console().readLine("Que numero quieres buscar?"));
        int n = 0;
        while (array[n] != num) {
            System.out.println("no se encuentra en la posicion " + n);
            n++;
            if(n==9){
                break;
            }
        }
        System.out.println("el numero se ha encontrado en la poscion " + n);
    }
}
