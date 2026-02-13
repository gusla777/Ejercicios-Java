public class ejercicio3 {
    public static void main(String[] args) {
        int Cuenta = Integer.parseInt(System.console().readLine("Dinero Actual? "));
        int Gasto = Integer.parseInt(System.console().readLine("Dinero a Gastar? "));
        int Ingreso = Integer.parseInt(System.console().readLine("Dinero a Ingresar? "));
        System.out.println("Las cuentas de hoy van a cabar siendo: " + Cuenta + " - " + Gasto + " + " + Ingreso + " = "
                + (Cuenta - Gasto + Ingreso));
    }
}
