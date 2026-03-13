public class ejercicio19 {
    public static void main(String[] args) {
        
        String frase = System.console().readLine("Escribe algo ----->      ");
        String palabra = System.console().readLine("Palabra a cambiar ----->      ");
        String palabra2 = System.console().readLine("Cambio ----->      ");
        System.err.println(frase.replace( palabra.equalsIgnoreCase(palabra) + " " , palabra2 +" "));
    }
}
