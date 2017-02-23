package Pattern.CommandPattern.fs;

/**
 * Created by milena
 * Concrete implementation of IFileSystemReceiver
 * Based on http://www.journaldev.com/1624/command-design-pattern-in-java-example-tutorial
 */
public class WindowsFileSystemReceiver implements IFileSystemReceiver {

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows OS");
    }
}
