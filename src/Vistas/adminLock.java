package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class adminLock {

	private JFrame frmAdministrador;
	private JPasswordField passwordField;
	public int switc;

	public int getSwitc() {
		return switc;
	}

	public void setSwitc(int switc) {
		this.switc = switc;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminLock window = new adminLock();
					window.frmAdministrador.setVisible(true);
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
	public void launcheradminLock() {
		initializerip();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializerip() {
		frmAdministrador = new JFrame();
		frmAdministrador.setTitle("Administrador");
		frmAdministrador.setBounds(100, 100, 279, 182);
		frmAdministrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdministrador.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(28, 44, 202, 20);
		frmAdministrador.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Ingrese password Administrador");
		lblNewLabel.setBounds(28, 11, 202, 14);
		frmAdministrador.getContentPane().add(lblNewLabel);
		
		JButton cancelbutton = new JButton("Cancelar");
		cancelbutton.setBounds(28, 75, 89, 23);
		frmAdministrador.getContentPane().add(cancelbutton);
		
		JButton submitbutton = new JButton("Aceptar");
		submitbutton.setBounds(141, 75, 89, 23);
		frmAdministrador.getContentPane().add(submitbutton);
		
		JLabel statusLabel = new JLabel("");
		statusLabel.setBounds(28, 109, 202, 14);
		frmAdministrador.getContentPane().add(statusLabel);
	}
}
