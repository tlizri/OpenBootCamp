package resource;

public class Callstack {
    public static void function1() {
        function2();
    }
    public static void function2() {
        function3();
    }
    public static void function3() {
        function4();
    }
    public static void function4() {
        function5();
    }
    public static void function5() {
        System.out.println("Funcion 5");
        throw new IllegalArgumentException();
    }
}
