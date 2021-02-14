public class WesternDishMemento implements Memento {
    private Menu WMenu;
    private int mCount;

    public WesternDishMemento(Menu WMenu) {
        this.WMenu = WMenu;
        mCount = WMenu.count;
    }

    public void restore() {
        WMenu.count = mCount;
    }

}
