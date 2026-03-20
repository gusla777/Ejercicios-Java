public class ejercicio24Encrypt {
    public static void main(String[] args) {

        int k = 0;
        String frase = System.console().readLine("Escribe algo ----->      ");
        char[] inversa = new char[frase.length()];
        for (int i = 0; i < inversa.length; i++) {
            inversa[i] = frase.charAt(frase.length() - i - 1);
            System.out.print(inversa[i]);
        }

        String clave = System.console().readLine("Dame la clave ----->      ");
        char[] descifrado = new char[clave.length()];

        for (int i = 0; i < clave.length(); i++) {
            descifrado[i] = clave.charAt(i);
            if (clave.charAt(i) == '+') {
                inversa[k] = (char) (inversa[k] + descifrado[i - 1]);
                k++;
            }
            else if (clave.charAt(i) == '-') {
                inversa[k] = (char) (inversa[k] - descifrado[i - 1]);
                k++;
            }

        }
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(inversa[i]);
        }

    }
}

// hola
// 3+4-5+7-
