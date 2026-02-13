public class ejercicio4 {
    public static void main(String[] args) {
        int Cuenta = Integer.parseInt(System.console().readLine("Que dorsal ( del 1 al 5 ) quieres saber? "));
        switch (Cuenta) {
            case 1:
                System.out.println("ivan");
                break;
            case 2:
                System.out.println("paulo");
                break;
            case 3:
                System.out.println("juan");
                break;
            case 4:
                System.out.println("pedro");
            case 5:
                System.out.println("miguel");
                break;
            default:
                System.out.println("Este dorsal no esta en el equipo");
        }
    }
}
