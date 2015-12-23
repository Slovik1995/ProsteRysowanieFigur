package prog1;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Square extends Shape{
	  public Square(){
		super.name="Square";
	  }
	  public void draw(Graphics g){
		  int x=10,y=10,w=100, h=100;
		  Graphics2D g2 = (Graphics2D)g;
	        Rectangle e = new Rectangle(x,y,w,h);
	        g2.draw(e);

	        GradientPaint gp = new GradientPaint(x, x, Color.red,x+w, y+h, Color.blue, false);
	        // Fill with a gradient.
	        g2.setPaint(gp);
	        g2.fill(e);
	        g2.draw(e);
	  }
	}
