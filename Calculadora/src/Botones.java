import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Botones extends Ventana implements MouseListener{
	
	private JButton suma;
	private JButton resta;
	private JButton multi;
	private JButton divi;
	private JButton borrar;
	private JTextField num1;
	private JTextField num2;
	private JLabel resul;
	
	Botones(int x, int y, String s) {
		super(x, y, s);
		// TODO Auto-generated constructor stub
		
		this.setLayout(null);
///////////////botones de opciones///////////////////////////////////////////////////////////		
		suma = new JButton("suma");
		suma.setBounds(50, 100, 150, 30);
		suma.setBackground(Color.blue);
		suma.setForeground(Color.white);
		suma.addMouseListener(new MouseListener(){
				
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			double nume1, nume2, result;
			String res;
			nume1 = Double.parseDouble(num1.getText());
			nume2 = Double.parseDouble(num2.getText());
			result = nume1 + nume2;
			res = String.valueOf(result);
			resul.setText(num1.getText()+" "+" + "+" "+num2.getText()+" = "+res);
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
		});
		
		resta = new JButton("resta");
		resta.setBounds(50, 150, 150, 30);
		resta.setBackground(Color.blue);
		resta.setForeground(Color.white);
		resta.addMouseListener(new MouseListener(){
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				double nume1, nume2, result;
				String res;
				nume1 = Double.parseDouble(num1.getText());
				nume2 = Double.parseDouble(num2.getText());
				result = nume1 - nume2;
				res = String.valueOf(result);
				resul.setText(num1.getText()+" "+" - "+" "+num2.getText()+" = "+res);
				
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
			});
		
		multi = new JButton("multiplicacion");
		multi.setBounds(50, 200, 150, 30);
		multi.setBackground(Color.blue);
		multi.setForeground(Color.white);
		multi.addMouseListener(new MouseListener(){
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				double nume1, nume2, result;
				String res;
				nume1 = Double.parseDouble(num1.getText());
				nume2 = Double.parseDouble(num2.getText());
				result = nume1 * nume2;
				res = String.valueOf(result);
				resul.setText(num1.getText()+" "+" * "+" "+num2.getText()+" = "+res);
				
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
			});
		
		divi = new JButton("division");
		divi.setBounds(50, 250, 150, 30);
		divi.setBackground(Color.blue);
		divi.setForeground(Color.white);
		divi.addMouseListener(new MouseListener(){
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				double nume1, nume2, result;
				String res;
				nume1 = Double.parseDouble(num1.getText());
				nume2 = Double.parseDouble(num2.getText());
				if(nume2 != 0){
					result = nume1 / nume2;
					res = String.valueOf(result);
					resul.setText(num1.getText()+" "+" / "+" "+num2.getText()+" = "+res);
				}
				else{
					resul.setText("no se puede hacer la division");
				}
				
				
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
			});
		
		borrar = new JButton("Borrar");
		borrar.setBounds(50, 300, 150, 30);
		borrar.setBackground(Color.blue);
		borrar.setForeground(Color.white);
		borrar.addMouseListener(new MouseListener(){
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				num1.setText("");
				num2.setText("");
				resul.setText("Resultado");
				
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
			});
		
/////////////////////para poner numeros///////////////////////////////////////////////
		
		num1 = new JTextField();
		num1.setBounds(300, 100, 150, 30);
		num2 = new JTextField();
		num2.setBounds(500, 100, 150, 30);
		
////////////////////para poner resultado//////////////////////////////////////////////////////
		
		resul = new JLabel("Resultado");
		resul.setBounds(440, 150, 300, 30);
		
		this.add(suma);
		this.add(resta);
		this.add(multi);
		this.add(divi);
		this.add(borrar);
		this.add(num1);
		this.add(num2);
		this.add(resul);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

		

}
