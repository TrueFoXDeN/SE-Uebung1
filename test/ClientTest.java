import org.hbrs.se.ws20.uebung1.view.Client;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    
    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
    
    @Test
    public void out() {
        Client c = new Client();
        c.display(-1);
        assertEquals("Das Ergebnis der Berechnung: [Übersetzung der Zahl -1 nicht möglich (1.0)]", outContent.toString().trim());
        outContent.reset();
        c.display(11);
        assertEquals("Das Ergebnis der Berechnung: [Übersetzung der Zahl 11 nicht möglich (1.0)]", outContent.toString().trim());
        outContent.reset();
        c.display(0);
        assertEquals("Das Ergebnis der Berechnung: [Übersetzung der Zahl 0 nicht möglich (1.0)]", outContent.toString().trim());
        outContent.reset();
        c.display(7);
        assertEquals("Das Ergebnis der Berechnung: [sieben]", outContent.toString().trim());
    }
}
