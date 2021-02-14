public class Order {
    protected String side, westernDrink, chineseDrink;
    protected int staffNo, officeLocation;
    Menu CWDish;

    public Order(Menu CWDish, String side, String westernDrink, String chineseDrink, int staffNo, int officeLocation) {
        this.CWDish = CWDish;
        this.side = side;
        this.westernDrink = westernDrink;
        this.chineseDrink = chineseDrink;
        this.staffNo = staffNo;
        this.officeLocation = officeLocation;
    }

    public Menu getCWDish() {
        return CWDish;
    }

    public void setCWDish(Menu CWDish) {
        this.CWDish = CWDish;
    }

    public String getSide() {
        return side;
    }

    public void setprice(String side) {
        this.side = side;
    }

    public String getWesternDrink() {
        return westernDrink;
    }

    public void setwesternDrink(String westernDrink) {
        this.westernDrink = westernDrink;
    }

    public String getChineseDrink() {
        return chineseDrink;
    }

    public void setChineseDrink(String chineseDrink) {
        this.chineseDrink = chineseDrink;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public int getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(int officeLocation) {
        this.officeLocation = officeLocation;
    }
   
    public void showOrder() {
        
        if (CWDish instanceof ChineseDish) {
            if(chineseDrink.equals("h")){
                chineseDrink = "Hot tea";

            }else if(chineseDrink.equals("i")){
                chineseDrink = "Iced Tea";
            }
            System.out.print("\nC: " + staffNo + ", " + officeLocation + "," + Main.CMenu.MDish + "," + "Chinese Soup"
                    + "," + chineseDrink);
        } else if (CWDish instanceof WesternDish) {
            if(side.equals("r")){
                side = "rice";
            }else if(side.equals("s")){
                side = "spaghetti";
            }else if (side.equals("f")){
                side = "French fries";
            }

            if(westernDrink.equals("ht")){
                westernDrink = "Hot Tea";
            }
            else if (westernDrink.equals("it")){
                westernDrink = "Iced tea";
            }
            else if (westernDrink.equals("hc")){
                westernDrink = "Hot coffee";
            }
            else if (westernDrink.equals("ic")){
                westernDrink = "Iced coffee";
            }
            System.out.print("\nW: " + staffNo + ", " + officeLocation + "," + Main.WMenu.MDish + "," + side + ","
                    + "Western Soup" + "," + westernDrink);
        }
    }
}
