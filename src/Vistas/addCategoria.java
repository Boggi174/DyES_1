package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class addCategoria {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCategoria window = new addCategoria();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addCategoria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 261, 212);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 64, 217, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton cancelbutton = new JButton("Cancelar");
		cancelbutton.setBounds(10, 107, 89, 23);
		frame.getContentPane().add(cancelbutton);
		
		JButton aceptarbutton = new JButton("Aceptar");
		aceptarbutton.setBounds(138, 107, 89, 23);
		frame.getContentPane().add(aceptarbutton);
		
		JLabel lblNewLabel = new JLabel("Categoria a agregar:");
		lblNewLabel.setBounds(10, 39, 217, 14);
		frame.getContentPane().add(lblNewLabel);
	}

}
