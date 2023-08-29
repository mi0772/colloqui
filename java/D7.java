import java.util.ArrayList;

public class D7 {
    private final ArrayList<String> elementi;

    public D7(ArrayList<String> elementi) {
        if (elementi == null || elementi.size() == 0) 
            throw new RuntimeException("Non devi passare elementi vuoti !");

        this.elementi = elementi;    
    }

    public int getElementiSize() {
        return elementi.size();
    }

    public String getElemento(int index) {
        return this.elementi.get(index);
    }

    //Questa classe è correttamente immutabile ?
    //cosa succede se qualcuno fa questo ?

    public static void main(String... args) {
        var p = new ArrayList<String>();
        p.add("ciao");

        var d = new D7(p);
        System.out.println(d.getElemento(0));
        p.set(0, "ti ho modificato !");
        System.out.println(d.getElemento(0));
        
    }
}
