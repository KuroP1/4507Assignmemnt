import java.util.*;
import java.io.*;
public class EditMenuCommand implements Command{
    Vector<Order> orders;
    Order order;
    private String CWDish,MDish;
    private int price,count;

    public EditMenuCommand(String CWDish,String MDish,int price, int count){
        this.CWDish = CWDish;
        this.MDish = MDish;
        this.price = price;
        this.count = count;
    }
    public void excecute() throws Exception{
        if(CWDish.equals("c")){
        Main.CMenu.setMdish(MDish);
        Main.CMenu.setprice(price);
        Main.CMenu.setCount(count);
        }else if(CWDish.equals("w")){
         Main.WMenu.setMdish(MDish);
        Main.WMenu.setprice(price);
        Main.WMenu.setCount(count);
        }
    }
    public void setOrders(Vector<Order>orders){
        this.orders = orders;
    }
  
    

}
