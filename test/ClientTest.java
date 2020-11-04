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
        assertNotEquals("Das Ergebnis der Berechnung: [minus eins]", outContent.toString().trim());
        outContent.reset();
        c.display(11);
        assertNotEquals("Das Ergebnis der Berechnung: [elf]", outContent.toString().trim());
        outContent.reset();
        c.display(0);
        assertNotEquals("Das Ergebnis der Berechnung: [null]", outContent.toString().trim());
        outContent.reset();
        c.display(7);
        assertEquals("Das Ergebnis der Berechnung: [sieben]", outContent.toString().trim());


    }
}