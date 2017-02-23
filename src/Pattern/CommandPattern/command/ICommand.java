package Pattern.CommandPattern.command;

/**
 * Created by milena
 * Based on http://www.journaldev.com/1624/command-design-pattern-in-java-example-tutorial
 */
public interface ICommand {
    /**
     * The action each implementation of ICommand will execute when called
     */
    void execute();
}
