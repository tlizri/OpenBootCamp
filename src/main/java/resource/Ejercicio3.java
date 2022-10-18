package resource;

public class Ejercicio3 {
    public static float sumar(float a, float b, float c) {
        return a + b + c;
    }
    public static int incrementarNumPuertas(){
        Coche miCoche = new Coche();
        miCoche.IncrementoPuertas(1);
        return miCoche.puertas;
    }
}

class Coche {
    int puertas = 0;

    public void IncrementoPuertas(int puertas) {
        this.puertas += puertas;
    }
}