package Pattern.CommandPattern.fs;

import Pattern.CommandPattern.command.ICommand;
/**
 * Created by milena
 * Based on http://www.journaldev.com/1624/command-design-pattern-in-java-example-tutorial
 */
public class FileInvoker {

    public ICommand command;

    public FileInvoker(ICommand c){
        this.command=c;
    }

    public void execute(){
        this.command.execute();
    }
}
