public class ejercicio1 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(System.console().readLine("Edad?"));
        edad = 100 - edad;
        System.out.println("te quedan " + edad + " años de vida (amable)");
    }
}
