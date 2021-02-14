import java.util.*;
import java.io.*;
public class ShowMenuCommandFactory implements CommandFactory {
    public Command createCommand() throws Exception{
        return new ShowMenuCommand();
    }
}
