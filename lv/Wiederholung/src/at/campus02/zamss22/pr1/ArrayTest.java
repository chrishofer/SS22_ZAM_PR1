package at.campus02.zamss22.pr1;

import java.util.Arrays;
import java.util.Locale;

public class ArrayTest {
    public static void main(String[] args) {
        String[] quartale = {"Frühling", "Sommer", "Herbst", "Winter"};

        String qu1 = quartale[0];
        //qu1.toUpperCase(Locale.ROOT);

        // arrays.tostring erlaubt uns schöne ausgabe - sonst wird Objektreferenz ausgegeben
        System.out.println(Arrays.toString(quartale));

        System.out.println(qu1);
        quartale[0] = "Fruehling";


        System.out.println(Arrays.toString(quartale));
        System.out.println(qu1);



        /// Bsp aus Übungszettel
        int []array1 = new int[3];
        int []array2 = {1, 2, 3};

        array1[0] = 3;
        array1[1] = 4;
        array1[2] = 5;

        System.out.print("+: ");
        for(int z = 0; z < array1.length; ++z){
            System.out.print(array1[z]+array2[z]);
            System.out.print(",");
        }
        System.out.println("---");
        System.out.print("*: ");
        for(int z = 0; z < array1.length; ++z){
            System.out.print(array1[z]*array2[z]);
            System.out.print(",");
        }


        // nun testen wir 2 dim array mit 4 zeilen und 3 spalten
        int [][] tabelle = new int[4][3];

        // alle werte sollen auf die zahl 42 gesetzt werden (meine glückszahl)
        // das ist die schleife für unsere zeilen
        for(int zeile = 0; zeile < tabelle.length; ++zeile){
            // das ist die schleife für unsere spalten
            for(int spalte = 0; spalte < tabelle[zeile].length; ++spalte){
                tabelle[zeile][spalte] = 42;
                // so ausgeben
                System.out.println(tabelle[zeile][spalte]);
            }
            // oder so ( this is the way)
            //System.out.println(Arrays.toString(tabelle[zeile]));
        }
        //System.out.println(Arrays.toString(tabelle));
        //System.out.println(Arrays.toString(tabelle[0]));

    }
}
