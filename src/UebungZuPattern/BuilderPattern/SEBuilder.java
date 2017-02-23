package UebungZuPattern.BuilderPattern;

/**
 * Created by Sonny on 17.01.2017.
 */
public class SEBuilder {

    private String thema1;
    private String thema2;
    private String thema3;
    private String thema4;
    private String thema5;

    public SEBuilder(String thema1,String thema2){
        this.thema1 = thema1;
        this.thema2 = thema2;
    }

    public SEBuilder(String thema1,String thema2,String thema3,String thema4){
        this.thema1 = thema1;
        this.thema2 = thema2;
        this.thema3 = thema3;
        this.thema4 = thema4;
    }

    public SE erstelleKlausur(){
        return new SE(this);
    }

    public String getThema1() {
        return thema1;
    }

    public void setThema1(String thema1) {
        this.thema1 = thema1;
    }

    public String getThema2() {
        return thema2;
    }

    public void setThema2(String thema2) {
        this.thema2 = thema2;
    }

    public String getThema3() {
        return thema3;
    }

    public void setThema3(String thema3) {
        this.thema3 = thema3;
    }

    public String getThema4() {
        return thema4;
    }

    public void setThema4(String thema4) {
        this.thema4 = thema4;
    }

    public String getThema5() {
        return thema5;
    }

    public void setThema5(String thema5) {
        this.thema5 = thema5;
    }


}
