public class WesternDish extends Menu{
    public WesternDish(String MDish,int price,int count){
        super(MDish,price,count);
    }
    public String toString() {
        return  "Main dish: " + MDish + "\n"+"with rice/spaghetti/French fries" + "\n"+"price: "+price +  "\n"+"available count: " + count ;
    }
}
