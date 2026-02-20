public class ejercicio8 {
    public static void main(String[] args) {
        int a = Integer.parseInt(System.console().readLine("1 = drcha 2 = izq 3 = palenca "));
        int num = (int)(Math.random()*4);

        if (num == a) {
            System.out.println("gol");
            System.out.println(num);
        }
        else{
            System.out.println("no gol");
            System.out.println(num);
        }
    }

}
