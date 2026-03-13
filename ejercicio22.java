public class ejercicio22 {
    public static void main(String[] args) {
        
        String frase = System.console().readLine("Escribe algo ----->      ");
        char[] letra = new char[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            letra[i] = frase.charAt(i);
        }
        for (int i = 0; i < letra.length; i++) {
            System.out.print((char)(letra[i]-1));
        }
    }
}
