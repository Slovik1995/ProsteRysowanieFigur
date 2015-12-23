package prog1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
public static void main(String[] arg){
	
	Frame f = new Frame();
	f. addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
         }
     });
	f.setSize(600, 600);
	f.setVisible(true);
	
	Square s = new Square();	
	Recktangle r = new Recktangle();
	Triangle t = new Triangle();

	MyPanel mp = new MyPanel();
	f.add(mp);
	
	mp.dodaj(r);
	mp.dodaj(t);
	mp.dodaj(s);
	Recktangle r2 = new Recktangle();
	mp.dodaj(r2);
	mp.rysuj();
	
	//mp.revalidate();
	//mp.repaint();
	//mp.validate();
	/*Panel p = new Panel();
	p.setSize(600, 600);
	p.setVisible(true);
	f.add(p);
	Graphics g = p.getGraphics();
	r.draw(g);
	s.draw(g);
	t.draw(g);
	*/
}

}
