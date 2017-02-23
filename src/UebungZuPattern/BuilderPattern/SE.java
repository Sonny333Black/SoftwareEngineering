package UebungZuPattern.BuilderPattern;

/**
 * Created by Sonny on 17.01.2017.
 */
public class SE {
    private String thema1;
    private String thema2;
    private String thema3;
    private String thema4;
    private String thema5;

    public SE(SEBuilder seb){
        this(seb.getThema1(),seb.getThema2(),seb.getThema3(),seb.getThema4());
    }

    public SE(String thema1,String thema2,String thema3,String thema4){
        this.thema1 = thema1;
        this.thema2 = thema2;
        this.thema3 = thema3;
        this.thema4 = thema4;
    }

    public SE(String thema1,String thema2){
        this.thema1 = thema1;
        this.thema2 = thema2;
    }

    public void ausgabe(){
        if(thema1!=null){
            System.out.println("Thema: "+thema1);
        }
        if(thema2!=null){
            System.out.println("Thema: "+thema2);
        }
        if(thema3!=null){
            System.out.println("Thema: "+thema3);
        }
        if(thema4!=null){
            System.out.println("Thema: "+thema4);
        }

    }
}
