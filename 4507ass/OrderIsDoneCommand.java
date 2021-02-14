import java.util.*;
import java.io.*;
public class OrderIsDoneCommand  implements Command{
    Vector<Order> orders;
    Order order;
    public void excecute(){
        System.out.println("Complete Order" );
        for(int i=0;i<orders.size();i++){
            if(orders.elementAt(i)!=null){
            orders.elementAt(i).showOrder();
            orders.remove(i);
            break;
            }
        }
    }
    public void setOrders(Vector<Order> orders) {
        this.orders = orders;
    }

}
