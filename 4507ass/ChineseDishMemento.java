public class ChineseDishMemento implements Memento{
    private Menu  CMenu;
    private int mCount;
    
    public ChineseDishMemento(Menu CMenu){
		this.CMenu = CMenu;
        mCount = CMenu.count;

    }
    public void restore(){
        CMenu.count = mCount;
	}
    
}


