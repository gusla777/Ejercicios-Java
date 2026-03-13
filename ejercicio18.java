public class ejercicio18 {
    public static void main(String[] args) {
        
        String frase = System.console().readLine("Escribe algo ----->      ");
        System.out.println( "Input en miniscula: " + frase.toLowerCase());
        System.out.println("Input en MAYSC: " + frase.toUpperCase());
        System.out.println("Caracteres: " + frase.length());
        String palabras[]=frase.split(" ");
        System.out.println("Palabras: " + palabras.length);
    }
}
