import java.util.*;
import java.io.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Menu CMenu = new ChineseDish("", 0, 0);
    public static Menu WMenu = new WesternDish("", 0, 0);
    public static Caretaker caretaker = new Caretaker();
    public static void main(String[] args) {
        Vector<Order> orders = new Vector<Order>();
        Command c;
        CommandFactory CF;
        
        while (true) {
            try {
                System.out.print("\nPlease enter command: [e | s | p | c | l  | d | q] ");
                System.out.print("\ne = Edit menu, s = Show menu, p = Place order, c = Cancel order,");
                System.out.print("\nl = List orders, d = order is Done, q = Quit");
                String choice = sc.nextLine();
                if (choice.equals("e")) {
                    CF = new EditMenuFactory();
                    c = CF.createCommand();
                    c.excecute();
                } else if (choice.equals("s")) {
                    CF = new ShowMenuCommandFactory();
                    c = CF.createCommand();
                    c.excecute();
                } else if (choice.equals("p")) {
                    CF = new PlaceOrderCommandFactory();
                    c = CF.createCommand();
                    c.setOrders(orders);
                    c.excecute();
                } else if (choice.equals("c")) {
                    CF = new CancelOrderCommandFactory();
                    c = CF.createCommand();
                    c.setOrders(orders);
                    c.excecute();
                } else if (choice.equals("l")) {
                    CF = new ListOrderCommandFactory();
                    c = CF.createCommand();
                    c.setOrders(orders);
                    c.excecute();
                } else if (choice.equals("d")) {
                    CF = new OrderIsDoneCommandFactory();
                    c = CF.createCommand();
                    c.setOrders(orders);
                    c.excecute();
                } else if (choice.equals("q")) {
                    System.exit(0);
                    break;
                }
            } catch (Exception e) {
                System.out.print("error");
            }
            System.out.println("");
        }

    }
}