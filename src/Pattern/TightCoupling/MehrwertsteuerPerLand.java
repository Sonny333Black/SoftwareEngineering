/**
 * Hält Daten (die Mehrwertsteuer für versch. Länder).
 * Hier stark vereinfacht
 */
public class MehrwertsteuerPerLand {
    public float mehrwertsteuer;

    public float getMehrwersteuerFürLand(String land){
        if (land.equals("DE")){
            mehrwertsteuer = .07f;
        }
        return mehrwertsteuer;
    }
}
