import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;


public class Menu extends Ventana implements MouseListener,ActionListener{
	
	Dibujos rec = new Dibujos();
	private JMenuBar menu;
	private JMenuItem nuevo, abrir, cerrar, guardar, imprimir;
	private JMenu fileMenu;
	private JMenu ediMenu,color,color2;
	private JLabel txt;
	
	private JRadioButtonMenuItem linea, rectangulo, circulo, curva, texto;
	private JCheckBoxMenuItem rojo, amarillo, verde, azul;

	Menu(int x, int y, String s) {
		super(x, y, s);
		// TODO Auto-generated constructor stub
		
		menu = new JMenuBar();
		this.setJMenuBar(menu);
		fileMenu = new JMenu("Archivo");
		ediMenu = new JMenu("Editar");
		fileMenu.setMnemonic('A');
		ediMenu.setMnemonic('E');
		
		menu.add(fileMenu);
		menu.add(ediMenu);
		
		nuevo = fileMenu.add("Nuevo");
		nuevo.setAccelerator(KeyStroke.getKeyStroke('N',InputEvent.ALT_DOWN_MASK));
		nuevo.addActionListener(this);
		abrir = fileMenu.add("Abrir");
		abrir.addActionListener(this);
		cerrar = fileMenu.add("Cerrar");
		cerrar.addActionListener(this);;
		fileMenu.addSeparator();
		guardar = fileMenu.add("Guardar");
		guardar.addActionListener(this);
		imprimir = fileMenu.add("Imprimir");
		imprimir.addActionListener(this);
		
		ediMenu.add(linea = new JRadioButtonMenuItem("Linea", true));
		linea.addActionListener(this);
		ediMenu.add(rectangulo = new JRadioButtonMenuItem("Rectangulo", true));
		rectangulo.addActionListener(this);
		ediMenu.add(circulo = new JRadioButtonMenuItem("Circulo", true));
		circulo.addActionListener(this);
		ediMenu.add(curva = new JRadioButtonMenuItem("Curva", true));
		curva.addActionListener(this);
		ediMenu.add(texto = new JRadioButtonMenuItem("Texto", true));
		texto.addActionListener(this);
		
		ButtonGroup types = new ButtonGroup();
		types.add(linea);
		types.add(rectangulo);
		types.add(circulo);
		types.add(curva);
		types.add(texto);
		ediMenu.addSeparator();
		
		color = new JMenu("Color");
		ediMenu.add(color);
		
		
		color.add(rojo = new JCheckBoxMenuItem("Rojo", true));
		color.add(amarillo = new JCheckBoxMenuItem("Amarillo", true));
		color.add(verde = new JCheckBoxMenuItem("Verde", true));
		color.add(azul = new JCheckBoxMenuItem("Azul", true));
		types.add(rojo);
		types.add(amarillo);
		types.add(verde);
		types.add(azul);
		
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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(linea)){
			rec.paint3(getGraphics());
		}
		
		if(arg0.getSource().equals(rectangulo)){
			rec.paint(getGraphics());
		}
		
		if(arg0.getSource().equals(circulo)){
			rec.paint2(getGraphics());
		}
		
		if(arg0.getSource().equals(curva)){
			rec.paint4(getGraphics());
		}
		
		if(arg0.getSource().equals(texto)){
			this.txt = new JLabel("Hola Mundo.");
			this.setBounds(100, 200, 250, 50);
			this.add(txt);
		}
	}

}
