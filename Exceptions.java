public class Exceptions {
    public static void metodo() throws Ex1, Ex2 {

    }

    public static void main(String... args) {
        metodo();
    }
}

class Ex1 extends RuntimeException {

}

class Ex2 extends Exception {

}
