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
        c.display(1);
        assertEquals("Das Ergebnis der Berechnung: [eins]", outContent.toString());
        outContent.reset();
        c.display(2);
        assertEquals("Das Ergebnis der Berechnung: [zwei]", outContent.toString());
    }
}