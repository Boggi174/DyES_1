package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Agregar_Nota {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agregar_Nota window = new Agregar_Nota();
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
	public Agregar_Nota() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 510, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton cancelarbutton = new JButton("Cancelar");
		cancelarbutton.setBounds(329, 560, 95, 23);
		frame.getContentPane().add(cancelarbutton);
		
		JButton btnNewButton = new JButton(">>");
		btnNewButton.setBounds(434, 543, 49, 40);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 104, 473, 1);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\artur\\Downloads\\newa.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBounds(388, 20, 73, 73);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton eliminarbtn = new JButton("Eliminar");
		eliminarbtn.setBounds(20, 560, 101, 23);
		frame.getContentPane().add(eliminarbtn);
		
		textField = new JTextField();
		textField.setBounds(10, 20, 297, 73);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 191, 485, 399);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo:");
		lblNewLabel_1_1.setBounds(10, 120, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Categoria: ");
		lblNewLabel_3.setBounds(10, 145, 80, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox categoriaComboBox = new JComboBox();
		categoriaComboBox.setBounds(67, 141, 250, 22);
		frame.getContentPane().add(categoriaComboBox);
		
		JComboBox tipoComboBox = new JComboBox();
		tipoComboBox.setBounds(47, 116, 109, 22);
		frame.getContentPane().add(tipoComboBox);
		
		JComboBox importanciaComboBox = new JComboBox();
		importanciaComboBox.setBounds(237, 116, 80, 22);
		frame.getContentPane().add(importanciaComboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Importancia:");
		lblNewLabel_2.setBounds(166, 120, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Nivel:");
		lblNewLabel_4.setBounds(327, 120, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(359, 116, 99, 22);
		frame.getContentPane().add(comboBox);
	}
}
