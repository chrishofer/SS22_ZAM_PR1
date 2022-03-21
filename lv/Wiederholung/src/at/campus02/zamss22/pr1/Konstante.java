package at.campus02.zamss22.pr1;

import at.campus02.zamss22.pr1.projekt1.Haeschen;

public class Konstante {


    public static void main(String[] args) {
        // das sind beides konstanten - mit final können wir parameter und variablen als solche deklarieren
        // ihnen kann man maximal 1 mal einen wert zuweisen
        final int geburtsjahr = 1970;
        final int todesjahr;

        System.out.println(geburtsjahr);
        // System.out.println(todesjahr); geht nicht da noch nicht initialisiert

        // geburtsjahr = 1998; geht nicht

        todesjahr = 2222;
        System.out.println(todesjahr);
        Math.abs(0.2);

        Haeschen h;
        // alternativ ohne import auch moeglich
        //at.campus02.zamss22.pr1.projekt1.Haeschen h;
    }
}
