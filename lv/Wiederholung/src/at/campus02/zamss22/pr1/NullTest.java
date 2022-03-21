package at.campus02.zamss22.pr1;

import java.util.Locale;

public class NullTest {
    public static void main(String[] args) {

        String hansisLieblingsPizza = null; // zeigt nirgendwohin - können nichts damit tun
        // weil dahinter kein string objekt steht
        //hansisLieblingsPizza.indexOf("a");

        // sobald wir ein objekt zuweisen ist es kein Problem mehr und geht ganz normal
        hansisLieblingsPizza = "Margherita (mit 1-2 kleinen Ananas unter dem Käse versteckt)";

        System.out.println(hansisLieblingsPizza);
        System.out.println(hansisLieblingsPizza.toUpperCase());

        String donau = "Donaudampfschifffahrtsgesellschaft";
        System.out.println(donau.indexOf("daaaaampf"));
    }
}
