package resource;

public class Ejercicio3 {
    public static void main(){
        //Parte1
        float resultado = sumar(1.24f, 2.98f, 3.44f);
        System.out.println(resultado);
        //Parte2
        Coche miCoche = new Coche();
        miCoche.IncrementoPuertas(1);
        System.out.println(miCoche.puertas);
    }
    public static float sumar(float a, float b, float c) {
        return a + b + c;
    }
}

class Coche {
    int puertas = 0;

    public void IncrementoPuertas(int puertas) {
        this.puertas += puertas;
    }
}