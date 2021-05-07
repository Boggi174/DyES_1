package Vistas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class addCategoria2 implements ActionListener {

	private JFrame frame;
	JTextField textField;
	JButton cancelbutton;
	JButton aceptarbutton;
	Connection connect;
	DB_Connection myphp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCategoria2 window = new addCategoria2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @return 
	 */
	public void launcheraddCategoria2() {
		addCategoria2 window = new addCategoria2();
		window.initializerip();
		window.frame.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializerip() {
		frame = new JFrame();
		frame.setBounds(100, 100, 261, 212);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 64, 217, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		cancelbutton = new JButton("Cancelar");
		cancelbutton.setBounds(10, 107, 89, 23);
		cancelbutton.addActionListener(this);
		frame.getContentPane().add(cancelbutton);
		
		aceptarbutton = new JButton("Aceptar");
		aceptarbutton.setBounds(138, 107, 89, 23);
		aceptarbutton.addActionListener(this);
		frame.getContentPane().add(aceptarbutton);
		
		JLabel lblNewLabel = new JLabel("Categoria a agregar:");
		lblNewLabel.setBounds(10, 39, 217, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		myphp = new DB_Connection();
		connect = myphp.conectar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == cancelbutton) {
			Ver_Nota2 se = new Ver_Nota2();
			se.launcherVer_Nota2();
			frame.dispose();
		}
		
		if(e.getSource() == aceptarbutton) {
			myphp.addCategoria(textField.getText());
			Ver_Nota2 se = new Ver_Nota2();
			se.launcherVer_Nota2();
			frame.dispose();
		}
		
	}

}
