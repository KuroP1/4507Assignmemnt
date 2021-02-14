public class CancelOrderCommandFactory implements CommandFactory{
    protected int staffNo;

    public Command createCommand() throws Exception{
        System.out.print("\nCancel Order: ");
        System.out.print("\nStaff number: ");
        staffNo = Main.sc.nextInt();
        Main.sc.nextLine();        
        System.out.print("\nOrder Cancelled: ");
        return new CancelOrderCommand(staffNo);
    }
}
