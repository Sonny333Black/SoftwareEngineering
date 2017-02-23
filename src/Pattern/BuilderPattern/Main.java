package Pattern.BuilderPattern;

/**
 * Created by milena on 13/12/2016.
 */
public class Main {
    public static void main(String[] args){
        Person milena = new PersonBuilder("Milena", "Zachow").withEmail("zachow@fh-flensburg.de").getResult();
        System.out.print(milena.toString());

    }
}
