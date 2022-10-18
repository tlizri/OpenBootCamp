package resource;

public class Objects {
    public static void main(){
        Coche coche = new Coche();                                                    // Reserva memoria para el objecto
        System.out.println("Puertas: " + coche.numeroDePuertas);
        System.out.println("Velocidad maxima: " + coche.velocidadMaxima);
        coche.acelerar();
        System.out.println("Velocidad: " + coche.velocidadActual);
        coche.decelerar();

        Coche coche2 = new Coche(2, 90);                 // Reserva memoria para el objecto
        System.out.println("Puertas: " + coche2.numeroDePuertas);
        System.out.println("Velocidad maxima: " + coche2.velocidadMaxima);
        coche2.acelerar();
        System.out.println("Velocidad: " + coche2.velocidadActual);
        coche2.decelerar();
    }
}
// Sin constructor, Java lo construye automaticamente
// Inicializa las propiedades de una clase cuando la instanciamos
class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche(){                                               // Constructor, lo primero que se ejecuta
                                                                  // al instanciar el objeto, inicializa sus propiedades
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Constructor sin parametros");
    }
    public Coche(int numeroDePuertas, int velocidadMaxima){                // Sobrecarga, dos funciones iguales pero con
                                                                           // distintos argumentos
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Constructor con parametros");
    }
    public void acelerar(){
        velocidadActual += 15;
    }
    public void decelerar(){}
}