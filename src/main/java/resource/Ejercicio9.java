package resource;

public class Ejercicio9 {
    public static void main() {
        Cliente client = new Cliente();
        client.setEdad(39);
        client.setNombre("Dani");
        client.setTelefono("+34 621 22 22 22");
        client.setCredito(1234.5F);

        System.out.println("Nombre: " + client.getNombre());
        System.out.println("Edad: " + client.getEdad());
        System.out.println("Telefono: " + client.getTelefono());
        System.out.println("Credito: " + client.getCredito());

        Trabajador empleado = new Trabajador();
        empleado.setEdad(44);
        empleado.setNombre("Jorge");
        empleado.setTelefono("+34 632 33 33 33");
        empleado.setSalario(2345.6F);

        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Telefono: " + empleado.getTelefono());
        System.out.println("Salario: " + empleado.getSalario());
    }
}
 class Persona {
    int edad;
    String nombre;
    String telefono;

    public Persona() {
        edad = -1;
        nombre = "";
        telefono = "";
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
     public void setNombre(String nombre){
         this.nombre = nombre;
     }
     public String getNombre(){
         return nombre;
     }
     public void setTelefono(String telefono){
         this.telefono = telefono;
     }
     public String getTelefono(){
         return telefono;
     }
 }

 class Cliente extends Persona {
    float credito;

    public void Cliente() {
        credito = -1;
     }
     public void setCredito(float credito){
        this.credito = credito;
     }
     public float getCredito(){
        return credito;
     }
 }

 class Trabajador extends Persona {
    float salario;
    public void Trabajador (){
        float salario = -1;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getSalario() {
        return salario;
    }
 }