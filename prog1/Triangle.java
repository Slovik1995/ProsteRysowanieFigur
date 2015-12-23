package prog1;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

public class Triangle extends Shape{
	  public Triangle(){
			super.name="Triangle";
		  }
	  public void draw(Graphics g){
		  int[] x={100,200,150};
		  int[]y={200,200,100};
		  Graphics2D g2 = (Graphics2D)g;
		  
		  Polygon p = new Polygon(x,y,3);
	   
	        g2.setColor(Color.RED);
	        g2.draw(p);

	        GradientPaint gp = new GradientPaint(100, 100, Color.red,200, 200, Color.blue, false);
	        // Fill with a gradient.
	        g2.setPaint(gp);
	        g2.fill(p);
	       g2.draw(p);
	  }
}
