public class ejercicio10 {
    public static void main(String[] args) throws InterruptedException {
        int hp1 = 100;
        int hp2 = 100;
       System.out.println(
" ,-----.                 ,--.             ,--.             ,------.        ,--.                                    \n" +
"'  .--./ ,---. ,--,--,--.|  |-.  ,--,--.,-'  '-. ,---.     |  .--. ' ,---. |  |,-. ,---. ,--,--,--. ,---. ,--,--,  \n" +
"|  |    | .-. ||        || .-. '' ,-.  |'-.  .-'| .-. :    |  '--' || .-. ||     /| .-. :|        || .-. ||      \\\\\n" +
"'  '--'\\\\' '-' '|  |  |  || `-' |\\\\ '-'  |  |  |  \\\\   --.    |  | --' ' '-' '|  \\  \\\\\\\\   --.|  |  |  |' '-' '|  ||  | \n" +
" `-----' `---' `--`--`--' `---'  `--`--'  `--'   `----'    `--'      `---' `--'`--'`----'`--`--`--' `---' `--''--' \n"
);
        System.out.println("_______PELEA POKEMON ________");
        while (hp1 > 0 && hp2 > 0) {

            int daño = (int) (Math.random() * 21);
            System.out.println("Daño a Pokemon1: " + daño);
            hp1 -= daño;
            System.out.println("Pokemon1 (HP): " + hp1 + "     Pokemon2 (HP): " + hp2);
            System.out.println("\n" + "\n" + "\n");
            Thread.sleep(300);
            daño = (int) (Math.random() * 21);
            System.out.println("Daño a Pokemon2: " + daño);
            hp2 -= daño;
            System.out.println("Pokemon1 (HP): " + hp1 + "     Pokemon2 (HP): " + hp2);
            System.out.println("\n" + "\n" + "\n");
            Thread.sleep(300);

        }
    }
}
