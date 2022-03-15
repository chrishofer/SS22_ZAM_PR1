package at.campus02.zamss22.pr1;

public class ArrayTest2 {
    public static void main(String[] args) {
        String[] smartphoneNamen = {"Samsung A51", "iPhone 13", "Huawei 15", "Nokia 3210", "Xiaomi 7T"};
        // eine zeile steht für ein smartphone
        // jede spalte in der zeile steht für verkaufszahlen in den jeweiligen quartalen
        int[][] smartphoneVerkaufszahlen = {{2000, 3000, 4000, 1000},
                                            {1000, 300, 1500, 7000},
                {2200, 300, 4000, 1000}, {2100, 3000, 4000, 2000}, {200, 300, 4000, 100}};

        for (int sNr = 0; sNr < smartphoneNamen.length; ++sNr) {
            System.out.println(smartphoneNamen[sNr]);
        }
        // for each loop - schnellschreibvariante
        // rechts vom : steht das array (oder sonstwas was mehr daten beinhaltet)
        // links daneben meine laufvariable die den typ des inhalts des arrays hat
        // (kann einen beliebigen namen haben - eine sogenannten "hansi" variable)
        for (String smarpthone : smartphoneNamen) {
            System.out.println(smarpthone);
        }

        // alle smartphone verkaufszahlen inklusive name ausgeben
        for(int sIndex = 0; sIndex < smartphoneVerkaufszahlen.length; ++sIndex){
            System.out.print(smartphoneNamen[sIndex]+": ");
            for(int qIndex = 0; qIndex < smartphoneVerkaufszahlen[sIndex].length; ++qIndex){
                System.out.print(smartphoneVerkaufszahlen[sIndex][qIndex] + " ");
            }
            // Nach Ausgabe aller Quartalszahlen einen Zeilenumbruch bitte
            System.out.println();
        }
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("----------");
        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufszahlen, -1));
        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufszahlen, 5));
        System.out.println(verkaufteAnzahlJahr(smartphoneVerkaufszahlen, 1));

    }
    // Die folgende Methode soll die über das Jahr verkauften Zahlen eines Smartphones zurückliefern:
    // zahlen: unsere Verkaufszahlen
    // welchesSmartphone: Index der angibt an welchem Smartphone wir interessiert sind (0 basiert)
    // Weitere Anforderung: Wenn ungültiger WErt auf welchesSmartphone angegeben wird bitte -1 zurückliefern
    public static int verkaufteAnzahlJahr(int[][] zahlen, int welchesSmartphone){
        if(welchesSmartphone < 0 || welchesSmartphone >= zahlen.length){
            return -1;
        }
        int summe = 0;
        for(int q = 0; q < zahlen[welchesSmartphone].length; ++q){
            summe += zahlen[welchesSmartphone][q];
        }
        return summe;
    }
    // Die folgende Methode soll uns den Namen des Smartphones liefern, das in einem bestimmten Quartal
    // am erfolgreichsten war
    // zahlen: unser verkaufzahlen
    // namen: unser smartphone namen
    // quartalNr: für welches Quartal soll berechnet werden (zwischen 1 und 4) - sonst Rückgabewert leerer String
    public static String erfolgreichstesSmartphoneQuartal(int [][] zahlen, String[] namen, int quartalNr){
        return ""; //TODO: durch korrekten Code ersetzen
    }

}
