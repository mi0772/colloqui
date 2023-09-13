public interface D8 {
     void metodo1();
    default void metodo2() {
        System.out.println("Ciao io sono il metodo 2");
    }
    
}
