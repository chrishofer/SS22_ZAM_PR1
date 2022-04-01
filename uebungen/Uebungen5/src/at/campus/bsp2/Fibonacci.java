package at.campus.bsp2;

public class Fibonacci {


        public static void main(String[] args) {
            // write your code here
            // Aufgabe: Fibonacci-Zahlen berechnen
            // -> 0 1 1 2 3 5 8 13 21 34 55


            int ersteFib = 0;
            int zweiteFib = 1;

            System.out.println(ersteFib);
            System.out.println(zweiteFib);

            // In einer rekursiven Methode
            fibonacciRekursiv(ersteFib, zweiteFib);


        }

        // brechen bei 1000 ab damit wir nicht unendlich weiter laufen
        public static void fibonacciRekursiv(int a, int b) {
            // Wir berechnen das Ergebnis aus a und b
            int ergebnis = a + b;
            // Wir überprüfen ob das Ergebnis bereits
            // das Limit überschreitet
            if (ergebnis > 1000) {
                return;
            } else {
                // Sonst geben wir das Ergebnis in der Konsole aus
                System.out.println(ergebnis);
                // und rufen dann die Methode wieder auf, <- REKURSION!
                // nur hat a nun den Wert von b
                // und b bekommt den Wert von ergebnis
                a = b;
                b = ergebnis;
                fibonacciRekursiv(a, b);
            }
        }


    }

}
