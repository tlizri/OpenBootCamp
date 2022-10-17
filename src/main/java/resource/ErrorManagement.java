package resource;

public class ErrorManagement {
    public static void variables(){
        // Usar nombres reconocibles (queremos un contador)
        int contador = 0;
        int numeros[][] = {
                {10, 20, 30, 40, 50},
                {10, 20, 30, 40, 50}
        };
        // usar "i", "j", "k" en bucles
        for(int[] array : numeros){
            for(int valor : array){
                System.out.println(valor);
            }
        }

        int c = suma(10, 20);
        System.out.println("La suma es " + c);
    }

    public static void comentarios(int numeros[][]){
        // BUEN COMENTARIO
        // Recorremos array bidimensional, y por cada subarray del mismo, mostramos el valor que tiene en ese momento.
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){
                System.out.println(numeros[i][j]);
            }
        }

        // MAL COMENTARIO
        var temperatura = 15;
        // Compruebo que la temperatura es 15
        if(temperatura == 15){
            System.out.println("Es 15");
        }
    }

    public static int suma(int a, int b){
        var temp = a + b;    // Usar temp para variables temporales
        return temp;
    }
}
