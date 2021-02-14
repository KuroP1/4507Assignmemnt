import java.util.*;

public class CancelOrderCommand implements Command {
    Vector<Order> orders;
    Order order;
    protected int staffNo;

    public CancelOrderCommand(int staffNo) {
        this.staffNo = staffNo;
    }

    public void excecute() {
        for (int i = 0; i < orders.size(); i++) {
            if (staffNo == orders.elementAt(i).getStaffNo()) {
                orders.elementAt(i).showOrder();
                if(orders.elementAt(i).getCWDish()instanceof ChineseDish ){
                    Main.caretaker.undoChinese();
                }else if(orders.elementAt(i).getCWDish()instanceof WesternDish ){
                    Main.caretaker.undoWestern();
                }
                orders.remove(i);
                System.out.println("Order Cancelled ");
                break;
            }
        }
    }

    public void setOrders(Vector<Order> orders) {
        this.orders = orders;
    }

}
