package resource;

public class Herencia {
    public static void main(){
        // velocidadMaxima es de la clase Vehiculo, heredada
        Coche coche = new Coche();    // Hereda constructor
        coche.velocidadMaxima = 120;
        coche.matricula = "ABC1234";
        coche.setSonido("BrRrRRr");    // Hereda setters y getters
        System.out.println(coche.getSonido());

        // Hereda lo que hereda la clase coche de vehiculo, herencia multinivel
        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.velocidadMaxima = 90;
        cocheElectrico.matricula = "DEF5678";
        System.out.println(cocheElectrico.compruebaMatricula("XXX"));

        Moto motillo = new Moto();
        motillo.setSonido("brr");
        System.out.println(motillo.getSonido());
    }
}

// Clase padre, si es abstracto no se puede usar, se usa sus hijos, es una abstracción de una clase más general
abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;
    public Vehiculo(){
        System.out.println("Constructor");
    }

    // Hay que implementar estas funciones en la clase hija
    abstract public String getSonido();
    abstract public void setSonido(String sonido);

    public boolean compruebaMatricula(String matricula){
        if(matricula == "XXX"){
            System.out.println("POLIMORFISMO en coche heredado de Vehiculo");
            return true;
        }
        return false;
    }

}
// Con "final" evitamos que otras clases hereden de Coche
/*final*/ class Coche extends Vehiculo {
    public String getSonido(){
        System.out.println("Sonido coche: " + sonido);
        return sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
    public boolean compruebaMatricula(String matricula){
        if(matricula == "XXX"){
            System.out.println("POLIMORFISMO de clase Coche");
            return true;
        }
        return false;
    }
}

class CocheElectrico extends Coche {}

class Moto extends Vehiculo {
    public String getSonido() {
        System.out.println("Sonido de moto: " + sonido);
        return sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}

class Motor {
    String tipomotor;
    public Motor() {
        System.out.println("Constructor Motor");
    }
}

// Interfaces
interface VehiculoTierra {
    void acelerar(int cuantaVelocidad);
    void frenar(int cuantaVelocidad);
}

class Quad implements VehiculoTierra {
    public void acelerar(int cuantaVelocidad) {

    }

    public void frenar(int cuantaVelocidad) {

    }
}