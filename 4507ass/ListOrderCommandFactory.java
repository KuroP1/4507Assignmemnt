public class ListOrderCommandFactory  implements CommandFactory{
    public Command createCommand() throws Exception {
        return new ListOrderCommand();
    }
}