public class Main {
    public static void main(String[] args) {

        //Parte condicionales
        int numeroIf = 50;
        if(numeroIf > 0){
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }

        //Parte bucle while
        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Parte bucle do-while
        numeroWhile = 2;
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        //Parte bucle for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //Parte switch-case
        String estacion = "PRIMAVERA";
        switch (estacion) {
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }
}
