public class ejercicio9 {
    public static void main(String[] args) {
        int palo = (int) (Math.random() * 4);
        System.out.println(palo);
        int carta = (int) (Math.random() * 12);
        System.out.println(carta);
        String cartaEspecial = "" + carta;
        if (carta == 9) {
            cartaEspecial = "sota";
        } else if (carta == 10) {
            cartaEspecial = "caballo";
        } else if (carta == 11) {
            cartaEspecial = "sota";
        } else {
            cartaEspecial = "" + carta++;
        }
        if (palo == 0) {
            System.out.println(cartaEspecial + " de bastos");
        } else if (palo == 1) {
            System.out.println(cartaEspecial + " de espadas");
        } else if (palo == 2) {
            System.out.println(cartaEspecial + " de copas");
        } else if (palo == 3) {
            System.out.println(cartaEspecial + " de oros");
        }
    }
}
