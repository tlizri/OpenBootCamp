package resource;

public class Debugging {
    public static void breakpoint() {
        int suma = 0;

        suma = suma + 15;    // Punto de ruptura

        System.out.println(suma);
    }

    public static void watchpoint() {
        int valores[] = new int[5];
        int posicion = 5;
        System.out.println(valores[posicion]);    // Punto de ruptura + condicion: posicion > valores.length
    }
}
