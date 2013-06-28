import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import static javax.swing.Action.*;


public class ToolBarDemo extends Ventana implements MouseListener{
	
	private MyAction miaccion;
	private JToolBar toolBar;
	private JButton btnMiAccion;
	private JPopupMenu popup;
	
	public ToolBarDemo(int x, int y, String s) {
		super(x, y, s);
		// TODO Auto-generated constructor stub
		
		toolBar = new JToolBar();
		this.getContentPane().add(toolBar, BorderLayout.NORTH);
		miaccion = new MyAction("Opcion");
		miaccion.putValue(LARGE_ICON_KEY, new ImageIcon("img/MEX.JPG"));
		miaccion.putValue(SHORT_DESCRIPTION, "mi boton para esta opcion");
		btnMiAccion = new JButton(miaccion);
		btnMiAccion.setHideActionText(true);
		btnMiAccion.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(2,5,5,2),
				              BorderFactory.createRaisedSoftBevelBorder()));
		toolBar.add(btnMiAccion);
		popup = new JPopupMenu("General");
		popup.add(new JMenuItem("Hola"));
		this.addMouseListener(this);
		
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
		if(arg0.getButton() == arg0.BUTTON3){
			popup.show(this, arg0.getX(), arg0.getY());
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
