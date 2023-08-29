class B extends A {
    void metodo() {
        System.out.println("ciao, sono il metodo di B");
    }
}

class A {
    void metodo() {
        System.out.println("ciao, sono il metodo di A");
    }
}

public class D3 {
    public static void main(String... args) {
        A a = new B();

        a.metodo();
    }
}


