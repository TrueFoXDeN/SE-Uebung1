import org.hbrs.se.ws20.uebung1.view.Client;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    public static void main(String[] args) {
        Client c = new Client();
        c.display(-1);
        System.out.println("Das Ergebnis der Berechnung: [Übersetzung der Zahl -1 nicht möglich (1.0)]");
        System.out.println("-------------------------");
        c.display(11);
        System.out.println("Das Ergebnis der Berechnung: [Übersetzung der Zahl 11 nicht möglich (1.0)]");
        System.out.println("-------------------------");
        c.display(0);
        System.out.println("Das Ergebnis der Berechnung: [Übersetzung der Zahl 0 nicht möglich (1.0)]");
        System.out.println("-------------------------");
        c.display(7);
        System.out.println("Das Ergebnis der Berechnung: [sieben]");

    }
}
