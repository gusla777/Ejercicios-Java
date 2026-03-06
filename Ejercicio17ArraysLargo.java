public class Ejercicio17ArraysLargo {
    public static void main(String[] args) {
        int array[][] = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        };

        int x = 0;
        int y = 0;
        int oldX;
        int oldY;
        array[0][0] = 5;




        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    while (true) {
            String input = System.console().readLine("MUEVETE");
            oldX = x;
            oldY = y;
            if (input.equalsIgnoreCase("w")) {
                x = x + 1;
                if (x==10) {
                    x = 0;
                }
                System.out.println(x);
            }
            if (input.equalsIgnoreCase("s")) {
                x = x - 1;
                if (x == -1) {
                    x = 9; 
                }
                System.out.println(x);
            }
            if (input.equalsIgnoreCase("a")) {
                y = y - 1;
                if (y == -1) {
                    y = 9;
                }
                System.out.println(y);
            }
            if (input.equalsIgnoreCase("d")) {
                y = y +1;
                if (y==10) {
                    y = 0;
                }
                System.out.println(y);
            }

            for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[oldX][oldY] = 0;
                array[x][y] = 5;
                System.out.print((array[i][j]) + " ");

            }
            System.out.println();
        }

                
                
                
            }





            }}
        
        
        
        
        
      



