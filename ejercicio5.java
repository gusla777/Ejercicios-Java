public class ejercicio5 {
    public static void main(String[] args) {
        String frase = System.console().readLine("Introduce una Frase ---> ");
        int a = Integer.parseInt(System.console().readLine("Cuantas veces la escribo? "));
        for (int i = 0; i < a; i++) {
            System.out.println(frase);
        }
    }
}
