public class ChineseDish extends Menu{

    public ChineseDish(String MDish,int price,int count){
        super(MDish,price,count);
    }
    public String toString() {
        return  "Main dish: " + MDish + "\n"+"with rice, Chinese soup, Chinese tea" + "\n"+"price: "+price +  "\n"+"available count: " + count ;
    }
}
