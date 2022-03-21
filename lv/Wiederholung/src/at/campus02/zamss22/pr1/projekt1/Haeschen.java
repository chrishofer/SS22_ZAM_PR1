package at.campus02.zamss22.pr1.projekt1;

public class Haeschen {
    String name;
    String farbe;
    static String spezies = "Leporidae";


    public void hoppel(String wohin){
        System.out.println(name + " hoppelt " + wohin);
    }
    // in statischen methoden können wir nur auf statische attribute zugreifen
    // java weiß bei nicht statischen attributen ja nicht von welchem objekt oder instanz wir
    // es haben wollen bzw. ob es überhaupt eine gibt
    public static void ausgabeSpezies(){
        spezies = "Lateinischer Name:" + spezies;
        System.out.println(spezies);
    }
}
