import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CalculadoraClase extends Ventana implements Operaciones, MouseListener{
	
	private JButton suma, resta, multi, divi;
	private JTextField txt;
	private JLabel lb1;

	CalculadoraClase(int x, int y, String s) {
		super(x, y, s);
		// TODO Auto-generated constructor stub
		
		this.setLayout(null);
		this.suma = new JButton("+");
		this.suma.setBounds(400, 100, 50, 50);
		this.resta = new JButton("-");
		this.resta.setBounds(400, 160, 50, 50);
		this.multi = new JButton("*");
		this.multi.setBounds(400, 220, 50, 50);
		this.divi = new JButton("/");
		this.divi.setBounds(400,280, 50, 50);
		this.add(suma);
		this.add(resta);
		this.add(multi);
		this.add(divi);
		
		this.txt = new JTextField();
		this.txt.setBounds(50, 100, 250, 50);
		this.add(txt);
		
		this.lb1 = new JLabel("0");
		this.txt.setBounds(50, 50, 250, 50);
		this.add(lb1);
	}

	@Override
	public float suma(float a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float resta(float a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float multiplicacion(float a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float division(float a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
