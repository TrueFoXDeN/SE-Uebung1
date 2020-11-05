import org.hbrs.se.ws20.uebung1.view.Client;

public class SimpleTest {
    public static void main(String[] args) {
        Client c = new Client();
        System.out.println("Expected: Das Ergebnis der Berechnung: [Übersetzung der Zahl -1 nicht möglich (1.0)]");
        System.out.print("Actual:   ");
        c.display(-1);
        System.out.println("-------------------------");
        System.out.println("Expected: Das Ergebnis der Berechnung: [Übersetzung der Zahl 11 nicht möglich (1.0)]");
        System.out.print("Actual:   ");
        c.display(11);
        System.out.println("-------------------------");
        System.out.println("Expected: Das Ergebnis der Berechnung: [Übersetzung der Zahl 0 nicht möglich (1.0)]");
        System.out.print("Actual:   ");
        c.display(0);
        System.out.println("-------------------------");
        System.out.println("Expected: Das Ergebnis der Berechnung: [sieben]");
        System.out.print("Actual:   ");
        c.display(7);


    }
}
