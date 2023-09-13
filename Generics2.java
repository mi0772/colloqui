public class Generics2 {
    
    public static <T extends Number> void metodo(T t) {
        System.out.print(t);
    }

    public static void main(String... args) {
        metodo(null);
    }
}
