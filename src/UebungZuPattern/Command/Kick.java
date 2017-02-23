package UebungZuPattern.Command;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Kick implements ICommand{

    private Receiver receiver;

    public Kick(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.kick();
    }
}
