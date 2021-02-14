import java.util.Vector;

public interface Command {
    public void excecute() throws Exception;
   public void setOrders(Vector<Order> orders);
}
