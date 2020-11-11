package org.hbrs.se.ws20.uebung1.control;

/**
 * Das Translator Interface. Die Anzahl der Methoden ist fix
 * und darf NICHT erweitert werden. Sichtbarkeiten der Methoden koennen
 * unter Umstaenden angepasst werden.
 *
 * @author saschaalda
 */
// interface wurde auf public geändert
public interface Translator {

    double version = 1.0; // Version des Interface

    /*
     * Uebersetzt eine numerische Zahl in eine String-basierte
     * Repraesentation gemaess der Spezifikation in der Aufgabe 1-2
     */
    String translateNumber(int number);

} 








