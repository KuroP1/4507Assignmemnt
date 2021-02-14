import java.util.*;
import java.io.*;

public class ShowMenuCommand implements Command {
    Vector<Order> orders;
    Order order;

    public void excecute(){
        System.out.print("\nChinese style Business Set Lunch");
        System.out.print("\n"+Main.CMenu);
        System.out.print("\nWestern style Business Set Lunch");
        System.out.print("\n"+Main.WMenu);
    }
    public void setOrders(Vector<Order>orders){
        this.orders = orders;
    }

}
