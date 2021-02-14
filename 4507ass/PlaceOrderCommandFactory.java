public class PlaceOrderCommandFactory implements CommandFactory {
    protected String CWDish, side, westernDrink, chineseDrink;
    protected int staffNo, officeLocation;
    

    public Command createCommand() throws Exception {
        System.out.print("\nPlace Order: ");
        System.out.print("\nChinese or Western (c | w):  ");
        CWDish = Main.sc.nextLine();

        if (CWDish.equals("c")) {
            int cSoldOut = Main.CMenu.getCount();
            if (cSoldOut > 0) {
                System.out.print("\nOolong Tea: hot or iced (h | i):  ");
                chineseDrink = Main.sc.nextLine();
            } else {
                return new PlaceOrderCommand(null,null,null,null,0,0);
            }

        } else if (CWDish.equals("w")) {
            int wSoldOut = Main.WMenu.getCount();
            if (wSoldOut > 0) {

                System.out.print("\nside: rice, spaghetti, French fries (r | s | f): ");
                side = Main.sc.nextLine();
                System.out.print("\ntea or coffee, hot or iced (ht| it | hc | ic):");
                westernDrink = Main.sc.nextLine();
            }else{
                return new PlaceOrderCommand(null,null,null,null,0,0);
                
            }

        }
        System.out.print("\nStaff Number: ");
        staffNo = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.print("\nOffice Location: ");
        officeLocation = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("\nOrder Placed");
        return new PlaceOrderCommand(CWDish,side,westernDrink,chineseDrink,staffNo,officeLocation);
    }
}
