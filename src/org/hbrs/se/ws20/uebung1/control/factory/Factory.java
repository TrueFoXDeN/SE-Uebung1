package org.hbrs.se.ws20.uebung1.control.factory;
import org.hbrs.se.ws20.uebung1.control.GermanTranslator;
import org.hbrs.se.ws20.uebung1.control.Translator;


public class Factory {
    //Factory Methode zur Objekt-Erzeugung
    public static Translator createGermanTranslator(){
        return new GermanTranslator();
    }
}
