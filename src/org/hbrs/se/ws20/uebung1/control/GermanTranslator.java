package org.hbrs.se.ws20.uebung1.control;

public class GermanTranslator implements Translator {

    public String date = "Nov/2020"; // Default-Wert

    // Methode zur Übersetzung einer Zahl in eine String-Repraesentation
    public String translateNumber(int number) {
        try{
            // String Array mit String-Reprasentationen
            String[] zahlen = {"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};

            // Rückgabe des Strings an der Stelle number - 1
            return zahlen[number-1];

        //Fange ArrayIndexOutOfBoundsException, erwartet wenn number nicht zwischen 1 - 10
        }catch (ArrayIndexOutOfBoundsException e) {
            // Rückgabe einer Fehlermeldung als String, mit number und version
            return "Übersetzung der Zahl " + number + " nicht möglich (" + version + ")";
        }
    }

    /**
     * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
     */
    public void printInfo() {
        System.out.println("GermanTranslator v1.9, erzeugt am " + this.date);
    }

    /**
     * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Nov/2020))
     * Das Datum sollte system-intern gesetzt werden und nicht von externen View-Klassen
     */
    public void setDate(String date) {
        this.date = date;
    }

}
