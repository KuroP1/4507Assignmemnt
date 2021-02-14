import java.util.*;
import java.io.*;
public class OrderIsDoneCommandFactory implements CommandFactory{
    public Command createCommand() throws Exception {
        return new OrderIsDoneCommand();
    }
}
