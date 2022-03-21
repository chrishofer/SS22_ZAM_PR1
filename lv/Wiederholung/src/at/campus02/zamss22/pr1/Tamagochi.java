package at.campus02.zamss22.pr1;

public class Tamagochi {
    public int x;
    public int y;
    public int futterstand;

    public void fuettern(int zusatzFutter){
        futterstand = futterstand + zusatzFutter;
    }


    // schrittweise komplizierte loesung
    public void bewegen(String richtung, int schritte){
        while(futterstand > 0 && schritte > 0){
            if(richtung.equals("oben")){
                ++y;
            }
            else if(richtung.equals("unten"))
            {
                --y;
            }
            else if(richtung.equals("links"))
            {
                --x;
            }
            else if(richtung.equals("rechts")){
                ++x;
            }

            --schritte;
            --futterstand;
        }
    }

    public static void main(String[] args) {
        Tamagochi neon = new Tamagochi();
        neon.x = 6;
        neon.y = 4;
        neon.futterstand = 5;

        neon.bewegen("links", 6); // wir hoffen darauf, dass es 6 geht aber wird wohl nur 5 schritte sein
        System.out.println(neon.x + " " + neon.y);
        neon.fuettern(5);
        neon.bewegen("links", 1);
        System.out.println(neon.x + " " + neon.y);
        neon.bewegen("unten", 4);
        System.out.println(neon.x + " " + neon.y);
    }
}
