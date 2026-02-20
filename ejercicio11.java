public class ejercicio11 {
    public static void main(String[] args) {
        //forma 1 : crearlo vacio
        /*int[] numero = new int[10];
        numero[0]= 3;

        int[]predefinida ={3,7,6,5,3};
        for (int i = 0; i < predefinida.length; i++) {
            System.out.println(predefinida[i]);
        }*/
    
        String[] compra = new String[Integer.parseInt(System.console().readLine("Cuantas cosas quieres comprar?  "))];

        for (int i = 0; i < compra.length; i++) {
            compra[i] = System.console().readLine("Que quieres comprar??");
        }
        System.out.println("\n"+"LISTA DE LA COMPRA: ");
        for (int i = 0; i < compra.length; i++) {
            System.out.println(compra[i]);
            
        }
    
    
    
    }
}
