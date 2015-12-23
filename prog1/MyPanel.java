package prog1;

import java.awt.Panel;
import java.util.Iterator;
import java.util.LinkedList;

public class MyPanel extends Panel{
	LinkedList<Shape> list = new LinkedList<>();
	
	public MyPanel(){
		this.setSize(600,600);
		this.setVisible(true);
	}
	
	public void dodaj(Shape shape){
		list.add(shape);
	}
	
	public void rysuj(){
		Iterator<Shape> it = list.iterator(); 
		while(it.hasNext())
			it.next().draw(this.getGraphics());
	}
	
}
