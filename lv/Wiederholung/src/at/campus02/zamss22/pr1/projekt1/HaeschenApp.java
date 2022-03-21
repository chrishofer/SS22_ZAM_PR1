package at.campus02.zamss22.pr1.projekt1;

public class HaeschenApp {
    public static void main(String[] args) {
        // statisches Attribut bzw. Methode kann auch ohne Objekt oder Instanz verwendet werden
        // mit dem Namen der Klasse!!!
        System.out.println(Haeschen.spezies);
        Haeschen rogger = new Haeschen();
        // Zugriff auf Attribut mittels Objekt- bzw. Instanznamen
        rogger.name = "Rogger Rabbit";
        rogger.farbe = "weiß";
        System.out.println(rogger.name + " " + rogger.farbe);
        Haeschen bugs = null; // nur um zu zeigen, dass auch erst spaeter die instanz erzeugt werden kann
        // irgendwann spaeter
        bugs = new Haeschen();
        bugs.name = "Bugs Bunny";
        bugs.farbe = "grau";

        // wir testen unser hoppel methode - ohne haeschen geht nix
        // Haeschen. ... geht nicht
        bugs.hoppel("nach hinten");
        rogger.hoppel("in the woods");

        // Aufruf statische Methode
        Haeschen.ausgabeSpezies();

    }
}
