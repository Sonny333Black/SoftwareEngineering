package UebungZuPattern.Command;

/**
 * Created by Sonny on 17.01.2017.
 */
public class Punch implements ICommand{
    private Receiver receiver;

    public Punch(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.punch();
    }
}
