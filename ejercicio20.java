public class ejercicio20 {
    public static void main(String[] args) {
        int buena = 0;
        int mala = 0;
        String frase = System.console().readLine("Escribe un numero to largo ----->      ");
        char[] numeros = new char[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            numeros[i] = frase.charAt(i);
        }
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] == '0' || numeros[j] == '1' || numeros[j] == '2' || numeros[j] == '5' || numeros[j] == '7'
                    || numeros[j] == '9') {
                buena++;
            } else {
                mala++;
            }
        }
        if (mala > buena) {
            System.out.println("mala suerte");
        } else if (mala == buena) {
            System.out.println("termino neutro");
        } else {
            System.out.println("buena suerte");
        }
    }
}