package Pattern.CommandPattern.fs;

/**
 * Created by milena
 * Helper to find the correct underlying file system
 * Based on http://www.journaldev.com/1624/command-design-pattern-in-java-example-tutorial
 */
public class FileSystemReceiverUtil {

    public static IFileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:"+osName);
        if(osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }

}