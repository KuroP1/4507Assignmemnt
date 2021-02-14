import java.util.*;
import java.io.*;

public class PlaceOrderCommand implements Command {
    Vector<Order> orders;
    Order order;
    protected String CWDish, side, westernDrink, chineseDrink;
    protected int staffNo, officeLocation;

    public PlaceOrderCommand(String CWDish, String side, String westernDrink, String chineseDrink, int staffNo,
            int officeLocation) {
        this.CWDish = CWDish;
        this.side = side;
        this.westernDrink = westernDrink;
        this.chineseDrink = chineseDrink;
        this.staffNo = staffNo;
        this.officeLocation = officeLocation;
    }

    public void setOrders(Vector<Order> orders) {
        this.orders = orders;
    }

    public void excecute() {
        if (CWDish == null) {
            System.out.println("Sold Out");
        } else {
            if (CWDish.equals("c")) {

                order = new Order(Main.CMenu, side, westernDrink, chineseDrink, staffNo, officeLocation);
                orders.add(order);
                int count = Main.CMenu.getCount();
                Main.caretaker.saveChineseDish(Main.CMenu);
                count = count - 1;
                Main.CMenu.setCount(count);
            } else if (CWDish.equals("w")) {
                order = new Order(Main.WMenu, side, westernDrink, chineseDrink, staffNo, officeLocation);
                orders.add(order);
                int count = Main.WMenu.getCount();
                Main.caretaker.saveWesternDish(Main.WMenu);
                count = count - 1;
                Main.WMenu.setCount(count);
            }
        }
    }

}
