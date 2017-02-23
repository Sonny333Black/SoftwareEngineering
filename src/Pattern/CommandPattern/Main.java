package Pattern.CommandPattern;

import Pattern.CommandPattern.command.WriteFileCommand;
import Pattern.CommandPattern.fs.FileInvoker;
import Pattern.CommandPattern.fs.FileSystemReceiverUtil;
import Pattern.CommandPattern.fs.IFileSystemReceiver;
/**
 * Created by milena
 * Based on http://www.journaldev.com/1624/command-design-pattern-in-java-example-tutorial
 */
public class Main {
    public static void main (String[] args) {
        //Detecting the OS and Filesystem
        IFileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //Create command and execute
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        FileInvoker file = new FileInvoker(writeFileCommand);
        file.execute();
    }
}
