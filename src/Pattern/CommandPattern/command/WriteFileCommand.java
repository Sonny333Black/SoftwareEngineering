package Pattern.CommandPattern.command;

import Pattern.CommandPattern.fs.IFileSystemReceiver;

/**
 * Created by milena
 * Based on http://www.journaldev.com/1624/command-design-pattern-in-java-example-tutorial
 */

public class WriteFileCommand implements ICommand {

    private IFileSystemReceiver fileSystem;

    public WriteFileCommand(IFileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}