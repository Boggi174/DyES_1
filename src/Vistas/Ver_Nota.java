package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class Ver_Nota {

	private JFrame frame;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ver_Nota window = new Ver_Nota();
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
	public Ver_Nota() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 510, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton(">>");
		btnNewButton.setBounds(422, 519, 51, 50);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 101, 448, 1);
		frame.getContentPane().add(panel);
		
		txtNombre = new JTextField();
		txtNombre.setToolTipText("Nombre");
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNombre.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombre.setBounds(10, 31, 272, 59);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\artur\\Downloads\\newa.png"));
		lblNewLabel.setBorder(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(385, 17, 73, 73);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setToolTipText("Contenido");
		textPane.setBounds(10, 188, 474, 392);
		frame.getContentPane().add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setBounds(10, 123, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox tipoComboBox = new JComboBox();
		tipoComboBox.setBounds(47, 119, 109, 22);
		frame.getContentPane().add(tipoComboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Importancia:");
		lblNewLabel_2.setBounds(166, 123, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox importanciaComboBox = new JComboBox();
		importanciaComboBox.setBounds(237, 119, 80, 22);
		frame.getContentPane().add(importanciaComboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Categoria: ");
		lblNewLabel_3.setBounds(10, 148, 80, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox categoriaComboBox = new JComboBox();
		categoriaComboBox.setBounds(67, 144, 250, 22);
		frame.getContentPane().add(categoriaComboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Nivel:");
		lblNewLabel_4.setBounds(327, 123, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(359, 119, 99, 22);
		frame.getContentPane().add(comboBox);
	}
}
