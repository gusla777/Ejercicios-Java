public class ejercicio23 {
    public static void main(String[] args) {

        String frase = System.console().readLine("Escribe algo ----->      ");
        char[] inversa = new char[frase.length()];
        for (int i = frase.length() - 1; i >= 0; i--) {

            inversa[i] = frase.charAt(i);

            if (frase.charAt(i) == 'a') {
                inversa[i] = '0';
            }
            if (frase.charAt(i) == 'e') {
                inversa[i] = '1';
            }
            if (frase.charAt(i) == 'i') {
                inversa[i] = '2';
            }
            if (frase.charAt(i) == 'o') {
                inversa[i] = '3';
            }
            if (frase.charAt(i) == 'u') {
                inversa[i] = '4';
            }
            System.out.print(inversa[i]);
        }
        System.out.print("aca");

    }
}

