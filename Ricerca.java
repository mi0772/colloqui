import java.util.List;

public class Ricerca {

    public boolean ricerca(List<Integer> numeri, Integer numero) {
        for (Integer v : numeri) {
            if (v.equals(numero))
                return true;
        }
        return false;
    }

    public boolean ricercaWithStream(List<Integer> numeri, Integer numero) {
        //TODO: Implementare il metodo ricerca utilizzando gli stream
        return true;
    }

    public static void main(String...args) {
        var app = new Ricerca();
        var numeri = List.of(1,2,3,4,5);
        System.out.println(app.ricerca(numeri, 2));
        System.out.println(app.ricercaWithStream(numeri, 2));
        
    }
}