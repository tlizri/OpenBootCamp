package resource;

public class Ejercicio4 {
    public static void condicionales(int num){
        int numeroIf = num;
        if(numeroIf > 0){
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }
    }
    public static void bucleWhile(int num){
        int numeroWhile = num;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }
    public static void bucleDoWhile(int num){
        int numeroWhile = num;
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);
    }
    public static void bucleFor(){
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }
    public static void switchCase(String season){
        String estacion = season;
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
