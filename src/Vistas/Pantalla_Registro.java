package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Pantalla_Registro {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtUsuarios;
	private JTextField textField_4;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_Registro window = new Pantalla_Registro();
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
	public Pantalla_Registro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(631, 493, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setBounds(631, 459, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\artur\\Downloads\\user (1).png"));
		lblNewLabel_5.setBorder(null);
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
		
		txtUsuarios = new JTextField();
		txtUsuarios.setBorder(null);
		txtUsuarios.setEditable(false);
		txtUsuarios.setText("Usuarios: ");
		txtUsuarios.setBounds(42, 301, 86, 20);
		frame.getContentPane().add(txtUsuarios);
		txtUsuarios.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(138, 300, 107, 22);
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
	}
}
