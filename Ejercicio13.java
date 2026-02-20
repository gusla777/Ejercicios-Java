public class Ejercicio13 {
    public static void main(String[] args) {
        int[] meses= new int [12];
        int[] asteriscos = new int[12];
        int mayor = 0;
        String[] nombres= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};

        for (int i = 0; i < meses.length; i++) {
            meses[i] = Integer.parseInt(System.console().readLine("Cuantas visitas hicistes en "+ nombres[i] + " ?"));

            if (meses[i]>mayor) {
                mayor = meses[i];
            }
            asteriscos[i] = meses[i]/mayor * 10 ;
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + ":");
            for (int j = 0; j < asteriscos[j]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }




        }
    }
