package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import com.formdev.flatlaf.IntelliJTheme;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.awt.Frame;

public class Pantalla_Inicio_Sesion implements ActionListener
{

	private JFrame frmInicioDeSesion;
	private JPasswordField pwdContrasea;
	JButton btn_submit;
	JFormattedTextField frmtdtxtfldUsuario;
	JLabel status_label;
	JButton btn_registro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntelliJTheme.install( Pantalla_Inicio_Sesion.class.getResourceAsStream("AA.json" ) );
					Pantalla_Inicio_Sesion window = new Pantalla_Inicio_Sesion();
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
	public Pantalla_Inicio_Sesion() {
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
		
		frmtdtxtfldUsuario = new JFormattedTextField();
		frmtdtxtfldUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldUsuario.setText("Usuario");
		frmtdtxtfldUsuario.setBounds(224, 180, 162, 20);
		frmInicioDeSesion.getContentPane().add(frmtdtxtfldUsuario);
		
		pwdContrasea = new JPasswordField();
		pwdContrasea.setText("Contrase\u00F1a");
		pwdContrasea.setToolTipText("Contrase\u00F1a");
		pwdContrasea.setBounds(224, 227, 162, 20);
		frmInicioDeSesion.getContentPane().add(pwdContrasea);
		
		btn_submit = new JButton("»");
		btn_submit.setBounds(224, 275, 63, 23);
		btn_submit.addActionListener(this);
		frmInicioDeSesion.getContentPane().add(btn_submit);
		
		btn_registro = new JButton("Modificar");
		btn_registro.setBounds(297, 275, 89, 23);
		btn_registro.addActionListener(this);
		frmInicioDeSesion.getContentPane().add(btn_registro);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\artur\\Downloads\\user (1).png"));
		lblNewLabel.setBounds(277, 32, 82, 146);
		frmInicioDeSesion.getContentPane().add(lblNewLabel);
		
		status_label = new JLabel("");
		status_label.setBounds(234, 309, 152, 29);
		frmInicioDeSesion.getContentPane().add(status_label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int acceso  = 0 ;
		if(e.getSource() == btn_submit) {
			//System.out.println("Si funciono");
			DB_Connection myphp = new DB_Connection();
			Connection connect = myphp.conectar();
			ArrayList<Usuario> UsersArray = myphp.leerUsuarios(connect);
			String user = frmtdtxtfldUsuario.getText().toUpperCase();
			String password = String.valueOf(pwdContrasea.getPassword());
			for (Usuario x:UsersArray) {
				if(user.equals(x.getNombreMamalonMamalonzisimo().toUpperCase())) {
					if(password.equals(x.getContraseniaMamalona())) {
						acceso = 1;
						System.out.println("Entraste!");
						Pantalla_Principal2 sex = new Pantalla_Principal2();
						sex.launcherPantallaPrincipal2();
						frmInicioDeSesion.dispose();
						
					} else 
						acceso = 2;
					}
			}
		}
			if(acceso == 2) {
				status_label.setText("Contrasenia incorrecta!");
			}
			else if(acceso == 0) {
				status_label.setText("No existe el usuario!");
			}
		
	
		if(e.getSource() == btn_registro) {
			System.out.println("Webos!");
			Pantalla_Registro2 sexo = new Pantalla_Registro2();
			sexo.launcherPantallaDeRegistro2();
			frmInicioDeSesion.dispose();
		}
		
		
	}
}
