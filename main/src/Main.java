public class Main {
    public static void main(String[] args) {

        int numIf = -1;

        if (numIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negitavo");
        }


        int numWhile = 0;

        while (numWhile < 3) {
            System.out.println(numWhile);
            numWhile++;
        }

        int numDoWhile = 1;

        do {
            System.out.println(numDoWhile);
            numDoWhile++;
        } while (numWhile < 1);




        for (int numFor = 0; numFor <= 3; numFor++) {
            System.out.println(numFor);
        }


        var estacion = "Verano";


        switch(estacion){
            case "Invierno" :
                System.out.println("Es invierno");
                break;

            case "Verano" :
                System.out.println("Es verano");
                break;

            case "Primavera" :
                System.out.println("Es primavera");
                break;

            case "Otoño" :
                System.out.println("Es otoño");
                break;

            default:
                System.out.println("El dato ingresado no corresponde a ninguna estacion del año");
            }
        }

    }

