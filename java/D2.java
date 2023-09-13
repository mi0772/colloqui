public class D2 {
    
    {
        System.out.println("A");
    }

    static {
        System.out.println("B");
    }

    {
        System.out.println("C");
    }

    private D2() {
        System.out.println("D");
    }

    public static void main(String... args) {
        new D2();
    }
}
