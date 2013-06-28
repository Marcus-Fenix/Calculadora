import java.awt.Color;

import javax.swing.JFrame;


	public class Ventana extends JFrame {
	
	final static Color BG = Color.BLUE;
	final static Color FG = Color.BLACK;
	
	public void init()
	{
		this.setBackground(BG);
		this.setForeground(FG);
	}
	
	Ventana(int x, int y, String s)
	{
		this.init();
		this.setSize(x, y);
		//this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(s);
	}

}
