package UebungZuPattern.Command;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Fighter {
    public static void main (String args[]){
        Receiver re = new Receiver();
        Kick k = new Kick(re);
        Punch p = new Punch(re);


        for (int i = 0;i<10;i++){
            if(i%2==0){
                p.execute();
            }else{
                k.execute();
            }
        }
    }
}
