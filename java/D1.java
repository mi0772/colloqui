public class D1 {

    public static void main(String... args) {
        String s = "questa è la mia stringa";
        alterString(s);
        System.out.println(s);
    }

    private static String alterString(String sorgente) {
        return sorgente + " modificata";
    }
}