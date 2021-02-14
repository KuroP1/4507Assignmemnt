import java.util.*;
import java.io.*;
public class ListOrderCommand implements Command{
    Vector<Order> orders;
   
    public void setOrders(Vector<Order>orders){
        this.orders = orders;
    }

    public void excecute(){
        System.out.println("\nOutstanding Orders" );
        for(int i=0;i<orders.size();i++){
            orders.elementAt(i).showOrder();
        }
    }
    
}
