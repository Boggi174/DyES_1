package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Pantalla_Principal {

	private JFrame frmPantallaPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_Principal window = new Pantalla_Principal();
					window.frmPantallaPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla_Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPantallaPrincipal = new JFrame();
		frmPantallaPrincipal.setTitle("Pantalla Principal");
		frmPantallaPrincipal.setBounds(100, 100, 1280, 720);
		frmPantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPantallaPrincipal.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		
		frmPantallaPrincipal.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.setBounds(1098, 648, 69, 22);
		frmPantallaPrincipal.getContentPane().add(btnNewButton_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 1264, 28);
		frmPantallaPrincipal.getContentPane().add(toolBar);
		
		JButton nuevaCategoriaBtn = new JButton("Nueva Categoria");
		nuevaCategoriaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		toolBar.add(nuevaCategoriaBtn);
		
		JButton ayudaBtn = new JButton("Ayuda");
		toolBar.add(ayudaBtn);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 27, 329, 432);
		frmPantallaPrincipal.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox TelcomboBox = new JComboBox();
		TelcomboBox.setBounds(22, 44, 297, 34);
		panel.add(TelcomboBox);
		
		JComboBox ImgcomboBox = new JComboBox();
		ImgcomboBox.setBounds(22, 141, 297, 34);
		panel.add(ImgcomboBox);
		
		JComboBox ReccomboBox = new JComboBox();
		ReccomboBox.setBounds(22, 242, 297, 34);
		panel.add(ReccomboBox);
		
		JComboBox OtrcomboBox = new JComboBox();
		OtrcomboBox.setBounds(22, 344, 297, 34);
		panel.add(OtrcomboBox);
		
		JLabel lblNewLabel = new JLabel("Telefono");
		lblNewLabel.setBounds(22, 22, 74, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Imagen");
		lblNewLabel_1.setBounds(22, 123, 74, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Recordatorio");
		lblNewLabel_2.setBounds(22, 217, 108, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Otro");
		lblNewLabel_3.setBounds(22, 319, 74, 14);
		panel.add(lblNewLabel_3);
		
		JButton edittel = new JButton("Editar");
		edittel.setBounds(230, 89, 89, 23);
		panel.add(edittel);
		
		JButton editimg = new JButton("Editar");
		editimg.setBounds(230, 186, 89, 23);
		panel.add(editimg);
		
		JButton editrec = new JButton("Editar");
		editrec.setBounds(230, 287, 89, 23);
		panel.add(editrec);
		
		JButton btnNewButton_2 = new JButton("Editar");
		btnNewButton_2.setBounds(230, 389, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton vertel = new JButton("Ver");
		vertel.setBounds(157, 89, 63, 23);
		panel.add(vertel);
		
		JButton verimg = new JButton("Ver");
		verimg.setBounds(157, 186, 63, 23);
		panel.add(verimg);
		
		JButton verrec = new JButton("Ver");
		verrec.setBounds(157, 287, 63, 23);
		panel.add(verrec);
		
		JButton verotr = new JButton("Ver");
		verotr.setBounds(157, 389, 63, 23);
		panel.add(verotr);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\artur\\Pictures\\aasaas.png"));
		lblNewLabel_4.setBounds(10, 471, 319, 199);
		frmPantallaPrincipal.getContentPane().add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(349, 27, 905, 643);
		frmPantallaPrincipal.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel nombrenota = new JLabel("Bienvenido!");
		nombrenota.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		nombrenota.setBounds(10, 11, 357, 64);
		panel_1.add(nombrenota);
		
		JLabel idnota = new JLabel("");
		idnota.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		idnota.setBounds(716, 21, 156, 38);
		panel_1.add(idnota);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de creacion:");
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setEnabled(false);
		lblNewLabel_5.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 567, 197, 29);
		panel_1.add(lblNewLabel_5);
		
		JLabel fechanota = new JLabel("");
		fechanota.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		fechanota.setBounds(10, 591, 197, 29);
		panel_1.add(fechanota);
		
		JLabel contenidonota = new JLabel("");
		contenidonota.setBorder(UIManager.getBorder("ScrollPane.border"));
		contenidonota.setBounds(10, 86, 725, 546);
		panel_1.add(contenidonota);
		
		JLabel lblNewLabel_5_1 = new JLabel("Importancia:");
		lblNewLabel_5_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblNewLabel_5_1.setEnabled(false);
		lblNewLabel_5_1.setBounds(779, 86, 116, 29);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Categoria:");
		lblNewLabel_5_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblNewLabel_5_2.setEnabled(false);
		lblNewLabel_5_2.setBounds(779, 177, 116, 29);
		panel_1.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Nivel:");
		lblNewLabel_5_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblNewLabel_5_3.setEnabled(false);
		lblNewLabel_5_3.setBounds(779, 263, 116, 29);
		panel_1.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Autor:");
		lblNewLabel_5_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblNewLabel_5_4.setEnabled(false);
		lblNewLabel_5_4.setBounds(261, 567, 197, 29);
		panel_1.add(lblNewLabel_5_4);
		
		JLabel autornota = new JLabel("");
		autornota.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		autornota.setBounds(261, 591, 197, 29);
		panel_1.add(autornota);
		
		JLabel nivelnota = new JLabel("");
		nivelnota.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		nivelnota.setBounds(779, 303, 116, 29);
		panel_1.add(nivelnota);
		
		JLabel categorianota = new JLabel("");
		categorianota.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		categorianota.setBounds(779, 217, 116, 29);
		panel_1.add(categorianota);
		
		JLabel importancianota = new JLabel("");
		importancianota.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		importancianota.setBounds(779, 126, 116, 29);
		panel_1.add(importancianota);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("ID:");
		lblNewLabel_5_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		lblNewLabel_5_1_1.setEnabled(false);
		lblNewLabel_5_1_1.setBounds(677, 29, 116, 29);
		panel_1.add(lblNewLabel_5_1_1);
	}
}
