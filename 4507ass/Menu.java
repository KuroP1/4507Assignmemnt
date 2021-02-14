public class Menu {
    protected String MDish;
    protected int price,count;
    public Menu(String MDish,int price,int count){
        this.MDish = MDish;
        this.price = price;
        this.count = count;
    }
    
    public String getMDish(){ return MDish; }
    public void setMdish(String MDish){
        this.MDish = MDish;
    }
    public int getPrice(){ return price; }
    public void setprice(int price){
        this.price = price;
    }

    public int getCount(){ return count; }
    public void setCount(int count){
        this.count = count;
    }
    

}
