public class Ejercicio6 {
    public static void main(String[] args) {
        int menor = 0;
        int mayor = 0;
        int igual = 0;

        int a = Integer.parseInt(System.console().readLine("Cuantos numeros? "));
        for (int i = 0; i < a; i++) {
            int numero = Integer.parseInt(System.console().readLine((i+1) + "." + "Dime el numero: "));
            if (numero > 100) {
                mayor++;
            } else if (numero == 100) {
                igual++;
            } else {
                menor++;
            }
        }
        System.out.println("Recuento final:  menores -----> " + menor + "  mayores : " + mayor + "  igual :" + igual);
    }
}
