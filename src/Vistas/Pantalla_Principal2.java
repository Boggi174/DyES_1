package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class Pantalla_Principal2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the application.
	 * @return 
	 */
	public void launcherPantallaPrincipal2() {
		Pantalla_Principal2 window = new Pantalla_Principal2();
		window.initializerip();
		window.frame.setVisible(true);
	
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializerip() {
		
	
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(36, 75, 225, 36);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(36, 150, 225, 36);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(36, 230, 225, 36);
		frame.getContentPane().add(comboBox_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 302, 681);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("A\u00F1adir Nota");
		btnNewButton.setBounds(1153, 579, 101, 91);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.setBounds(1097, 625, 46, 45);
		frame.getContentPane().add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(343, 75, 911, 595);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(343, 55, 219, 22);
		frame.getContentPane().add(panel_2);
	}
}
