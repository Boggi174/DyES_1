package Vistas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class adminLock2 implements ActionListener {

	
	private JFrame frmAdministrador;
	JPasswordField passwordField;
	public int switc;
	JLabel statusLabel;
	String pass= "0012";
	JButton cancelbutton;
	JButton submitbutton;

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
					adminLock2 window = new adminLock2();
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
	public void launcheradminLock2() {
		adminLock2 window = new adminLock2();
		window.initializerip();
		window.frmAdministrador.setVisible(true);
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
		
		cancelbutton = new JButton("Cancelar");
		cancelbutton.setBounds(28, 75, 89, 23);
		cancelbutton.addActionListener(this);
		frmAdministrador.getContentPane().add(cancelbutton);
		
		submitbutton = new JButton("Aceptar");
		submitbutton.addActionListener(this);
		submitbutton.setBounds(141, 75, 89, 23);
		frmAdministrador.getContentPane().add(submitbutton);
		
		statusLabel = new JLabel("");
		statusLabel.setBounds(28, 109, 202, 14);
		frmAdministrador.getContentPane().add(statusLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == cancelbutton) {
			frmAdministrador.dispose();
		}
		
		if(e.getSource() == submitbutton) {
			if (pass.equals(String.valueOf(passwordField.getPassword()))) {
				this.switc = 1;
				frmAdministrador.dispose();
			}else
				this.switc = 0;
				statusLabel.setText("Contraseña incorrecta!");
				
		}
		
	}
}
