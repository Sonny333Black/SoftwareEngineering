package Zettel2.stefan;

/**
 * Hält Daten (die Mehrwertsteuer für versch. Länder).
 * Hier stark vereinfacht
 * TODO: land als ENUM übergeben
 */
interface MehrwertsteuerPerLand {
    float getMehrwersteuerFürLand(String land);
}
