package Vistas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class Pantalla_Registro2 implements ActionListener 
{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel txtUsuarios;
	private JPasswordField passwordField;
	JComboBox comboBox_1;
	ArrayList<Usuario> UsersArray;
	Connection connect;
	JButton btnNewButton;
	DB_Connection myphp;
	JButton btnNewButton_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_Registro2 window = new Pantalla_Registro2();
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
	public void launcherPantallaDeRegistro2() {
		Pantalla_Registro2 window = new Pantalla_Registro2();
		window.initializerip();
		window.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializerip() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 746, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setBounds(42, 127, 80, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Correo:");
		lblNewLabel_1.setBounds(42, 160, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero de Empleado:");
		lblNewLabel_2.setBounds(42, 74, 137, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono:");
		lblNewLabel_3.setBounds(42, 195, 57, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo de perfil:");
		lblNewLabel_4.setBounds(42, 245, 80, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(631, 493, 89, 23);
		btnNewButton.addActionListener(this);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(631, 459, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Imagen ");
		lblNewLabel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_5.setBackground(Color.GRAY);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(524, 74, 137, 135);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(252, 71, 98, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 124, 253, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(98, 157, 253, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 192, 253, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		txtUsuarios = new JLabel("Usuarios: ");
		txtUsuarios.setBounds(42, 301, 86, 20);
		frame.getContentPane().add(txtUsuarios);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(138, 300, 107, 22);
		comboBox_1.addActionListener(this);
		frame.getContentPane().add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 242, 231, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("1.- Administrador. 2.- Regular");
		lblNewLabel_6.setBounds(119, 270, 231, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_7.setBounds(334, 304, 80, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(400, 301, 243, 20);
		frame.getContentPane().add(passwordField);

		
		myphp = new DB_Connection();
		connect = myphp.conectar();
		UsersArray = myphp.leerUsuarios(connect);
		comboBox_1.addItem("Nuevo");
		for(Usuario x:UsersArray) {
			comboBox_1.addItem(x.getNombreMamalonMamalonzisimo());
		}
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== comboBox_1) {
			//System.out.println(comboBox_1.getSelectedItem()); 
			if(comboBox_1.getSelectedItem().equals("Nuevo")) {
				// Nombre
				textField_1.setText("");
				//Correo
				textField_2.setText("");
				//Numero de empleado
				textField.setText("");
				//Telefono
				textField_3.setText("");
				//Tipo de cuenta
				textField_4.setText("");
			} else {
				for( Usuario x: UsersArray) {
					if(x.getNombreMamalonMamalonzisimo().equals(comboBox_1.getSelectedItem())) {
						// Nombre
						textField_1.setText(x.getNombreMamalonMamalonzisimo());
						//Correo
						textField_2.setText(x.getCorreoPerron());
						//Numero de empleado
						textField.setText(String.valueOf(x.getIdUsuario()));
						//Telefono
						textField_3.setText(String.valueOf(x.getTelefonoPerron()));
						//Tipo de cuenta
						textField_4.setText(String.valueOf(x.getTipoDeUsuario()));
						//Contrasenia
						passwordField.setText(x.getContraseniaMamalona());
					}
				}
				
				
			}
			}
		if(e.getSource() == btnNewButton && comboBox_1.getSelectedItem().equals("Nuevo") ) {
			
			myphp.addUsuario(textField_1.getText() , String.valueOf(passwordField.getPassword()) , textField_2.getText() ,Long.parseLong(textField_3.getText()) , Integer.parseInt(textField_4.getText()) );
		}
		
		if(e.getSource()== btnNewButton_1 && !comboBox_1.getSelectedItem().equals("Nuevo")) {
			myphp.deleteUsuario(Integer.parseInt(textField.getText()));
		}
		
		if(e.getSource() == btnNewButton && !comboBox_1.getSelectedItem().equals("Nuevo")) {
			myphp.updateUsuario(Integer.parseInt(textField.getText()),textField_1.getText() , String.valueOf(passwordField.getPassword()) , textField_2.getText() ,Long.parseLong(textField_3.getText()) , Integer.parseInt(textField_4.getText()));
		}
	}
	
}
