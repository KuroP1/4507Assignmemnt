import java.util.*;
import java.io.*;
public class EditMenuFactory implements CommandFactory {


    private String CWDish,MDish;
    private int price,count;

    public Command createCommand() throws Exception{
        System.out.print("\nEdit Menu: ");
        System.out.print("\nChinese or Western (c | w): ");
         CWDish = Main.sc.nextLine();
        System.out.print("\nEnter main dish: ");
        MDish = Main.sc.nextLine();
        System.out.print("\nEnter price: ");
         price = Main.sc.nextInt();
         Main.sc.nextLine();
        System.out.print("\nEnter available count: ");
         count = Main.sc.nextInt();
         Main.sc.nextLine();
        System.out.println("\nMenu Updated");
        
        return new EditMenuCommand(CWDish,MDish, price, count);
    }
}
