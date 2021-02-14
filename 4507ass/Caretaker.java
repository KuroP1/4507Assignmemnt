import java.util.*;
public class Caretaker {
    private Vector CundoList;
	private Vector WundoList;
	public Caretaker(){
        CundoList = new Vector();
        WundoList = new Vector();
	}
	public void saveChineseDish(Menu cMenu){
		ChineseDishMemento CDM = new ChineseDishMemento(cMenu);
		CundoList.add(CDM);
	}
	public void saveWesternDish(Menu wMenu){
		WesternDishMemento WDM = new WesternDishMemento(wMenu);
		WundoList.add(WDM);
	}
	
	public void undoChinese(){
		if(CundoList.size() > 0){
			Object obj = CundoList.lastElement();
			Memento m = (Memento) obj;
			m.restore();
			CundoList.removeElement(m);
		}
    }
    public void undoWestern(){
		if(WundoList.size() > 0){
			Object obj = WundoList.lastElement();
			Memento m = (Memento) obj;
			m.restore();
			WundoList.removeElement(m);
		}
    }
    
}
