import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;


public class Dibujos extends JFrame{
	
	final static Color BG = Color.blue;
	final static Color FG = Color.blue;
	
	public void init(){
		this.setBackground(BG);
		this.setForeground(FG);
	}
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		
		Line2D.Double rec1 = new Line2D.Double(100,200,100,300);
		Line2D.Double rec2 = new Line2D.Double(100,300,400,300);
		Line2D.Double rec3 = new Line2D.Double(400,300,400,200);
		Line2D.Double rec4 = new Line2D.Double(100,200,400,200);
		//g2.setPaint(Color.blue);
		g2.draw(rec1);
		g2.draw(rec2);
		g2.draw(rec3);
		g2.draw(rec4);
	}
	
	public void paint2(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		
		Ellipse2D.Double rec1 = new Ellipse2D.Double(100,200,100,100);
		//g2.setPaint(Color.blue);
		g2.draw(rec1);
	}
	
	public void paint3(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		
		Line2D.Double rec1 = new Line2D.Double(100,300,400,300);
		//g2.setPaint(Color.blue);
		g2.draw(rec1);
	}
	
	public void paint4(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		
		Arc2D.Double rec1 = new Arc2D.Double(100,300,150, 150, 40, 100,Arc2D.OPEN);
		g2.draw(rec1);
	}

}
