package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JTextField;

public class Main__Inter {

	private JFrame frmInicioDeSesion;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main__Inter window = new Main__Inter();
					window.frmInicioDeSesion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main__Inter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicioDeSesion = new JFrame();
		frmInicioDeSesion.setResizable(false);
		frmInicioDeSesion.setTitle("Inicio de Sesion");
		frmInicioDeSesion.setBounds(100, 100, 632, 513);
		frmInicioDeSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicioDeSesion.getContentPane().setLayout(null);
		
		JFormattedTextField frmtdtxtfldUsuario = new JFormattedTextField();
		frmtdtxtfldUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldUsuario.setText("Usuario");
		frmtdtxtfldUsuario.setBounds(224, 180, 162, 20);
		frmInicioDeSesion.getContentPane().add(frmtdtxtfldUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Contrase\u00F1a");
		passwordField.setBounds(224, 227, 162, 20);
		frmInicioDeSesion.getContentPane().add(passwordField);
		
		JButton btn_submit = new JButton("Entrar");
		btn_submit.setBounds(224, 275, 63, 23);
		frmInicioDeSesion.getContentPane().add(btn_submit);
		
		JButton btn_registro = new JButton("Registrar");
		btn_registro.setBounds(297, 275, 89, 23);
		frmInicioDeSesion.getContentPane().add(btn_registro);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\artur\\Downloads\\user (1).png"));
		lblNewLabel.setBounds(277, 32, 82, 146);
		frmInicioDeSesion.getContentPane().add(lblNewLabel);
	}
}
