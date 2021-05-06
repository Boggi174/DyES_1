package Vistas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import java.awt.Color;
import javax.swing.JButton;

public class Pantalla_Principal2 implements ActionListener {

	private JFrame frame;
	JButton btnNewButton;
	Connection connect;
	DB_Connection myphp;
	ArrayList<Nota> notas;
	ArrayList<Categoria> categorias;
	ArrayList<Importancia> importancias;
	ArrayList<Nivel> niveles;
	ArrayList<Tipo> tipos;
	ArrayList<Usuario> usuarios;
	JButton btnNewButton_1;
	JButton nuevaCategoriaBtn;
	JButton ayudaBtn;
	JComboBox TelcomboBox;
	JComboBox ImgcomboBox;
	JComboBox ReccomboBox;
	JComboBox OtrcomboBox;
	JButton vertel;
	JButton verimg;
	JButton verrec;
	JButton verotr;
	JLabel nombrenota;
	JLabel idnota;
	JLabel fechanota;
	JLabel contenidonota;
	JLabel autornota ;
	JLabel nivelnota;
	JLabel categorianota;
	JLabel importancianota;
	String tiponota= "" ;
	int tiponota1=0;
	/**
	 * 
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
		frame.setTitle("Pantalla Principal");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		btnNewButton = new JButton("Nuevo");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(1179, 602, 75, 68);
		frame.getContentPane().add(btnNewButton);
		
		
		 btnNewButton_1 = new JButton("Editar");
		btnNewButton_1.setBounds(1098, 648, 69, 22);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(this);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(339, 27, 925, 654);
		frame.getContentPane().add(tabbedPane);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 1264, 28);
		frame.getContentPane().add(toolBar);
		
		nuevaCategoriaBtn = new JButton("Nueva Categoria");
		nuevaCategoriaBtn.addActionListener(this);
		toolBar.add(nuevaCategoriaBtn);
		
		ayudaBtn = new JButton("Ayuda");
		ayudaBtn.addActionListener(this);
		toolBar.add(ayudaBtn);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 27, 329, 432);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		TelcomboBox = new JComboBox();
		TelcomboBox.setBounds(22, 44, 297, 34);
		panel.add(TelcomboBox);
		
		ImgcomboBox = new JComboBox();
		ImgcomboBox.setBounds(22, 141, 297, 34);
		panel.add(ImgcomboBox);
		
		ReccomboBox = new JComboBox();
		ReccomboBox.setBounds(22, 242, 297, 34);
		panel.add(ReccomboBox);
		
		OtrcomboBox = new JComboBox();
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

		
		vertel = new JButton("Ver");
		vertel.setBounds(157, 89, 63, 23);
		vertel.addActionListener(this);
		panel.add(vertel);
		
		verimg = new JButton("Ver");
		verimg.setBounds(157, 186, 63, 23);
		verimg.addActionListener(this);
		panel.add(verimg);
		
		verrec = new JButton("Ver");
		verrec.setBounds(157, 287, 63, 23);
		verrec.addActionListener(this);
		panel.add(verrec);
		
		verotr = new JButton("Ver");
		verotr.setBounds(157, 389, 63, 23);
		verotr.addActionListener(this);
		panel.add(verotr);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(10, 470, 319, 200);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\artur\\Pictures\\aasaas.png"));
		frame.getContentPane().add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(349, 27, 905, 643);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		
		nombrenota = new JLabel("Bienvenido!");
		nombrenota.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		nombrenota.setBounds(10, 11, 357, 64);
		panel_1.add(nombrenota);
		
		idnota = new JLabel("");
		idnota.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		idnota.setBounds(716, 21, 156, 38);
		panel_1.add(idnota);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de creacion:");
		lblNewLabel_5.setEnabled(false);
		//lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 567, 197, 29);
		panel_1.add(lblNewLabel_5);
		
		fechanota = new JLabel("");
		fechanota.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		fechanota.setBounds(10, 591, 197, 29);
		panel_1.add(fechanota);
		
		contenidonota = new JLabel("");
		contenidonota.setBorder(UIManager.getBorder("ScrollPane.border"));
		contenidonota.setBounds(10, 86, 725, 546);
		panel_1.add(contenidonota);
		
		JLabel lblNewLabel_5_1 = new JLabel("Importancia:");
		lblNewLabel_5_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblNewLabel_5_1.setEnabled(false);
		//lblNewLabel_5_1.setVisible(false);
		lblNewLabel_5_1.setBounds(779, 86, 116, 29);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Categoria:");
		lblNewLabel_5_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblNewLabel_5_2.setEnabled(false);
		//lblNewLabel_5_2.setVisible(false);
		lblNewLabel_5_2.setBounds(779, 177, 116, 29);
		panel_1.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Nivel:");
		lblNewLabel_5_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblNewLabel_5_3.setEnabled(false);
		//lblNewLabel_5_3.setVisible(false);
		lblNewLabel_5_3.setBounds(779, 263, 116, 29);
		panel_1.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Autor:");
		lblNewLabel_5_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblNewLabel_5_4.setEnabled(false);
		//lblNewLabel_5_4.setVisible(false);
		lblNewLabel_5_4.setBounds(261, 567, 197, 29);
		panel_1.add(lblNewLabel_5_4);
		
		autornota = new JLabel("");
		autornota.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		autornota.setBounds(261, 591, 197, 29);
		panel_1.add(autornota);
		
		nivelnota = new JLabel("");
		nivelnota.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		nivelnota.setBounds(779, 303, 116, 29);
		panel_1.add(nivelnota);
		
		categorianota = new JLabel("");
		categorianota.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		categorianota.setBounds(779, 217, 116, 29);
		panel_1.add(categorianota);
		
		importancianota = new JLabel("");
		importancianota.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		importancianota.setBounds(779, 126, 116, 29);
		panel_1.add(importancianota);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("ID:");
		lblNewLabel_5_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 30));
		lblNewLabel_5_1_1.setEnabled(false);
		lblNewLabel_5_1_1.setBounds(677, 29, 116, 29);
		panel_1.add(lblNewLabel_5_1_1);
		
		
		myphp = new DB_Connection();
		connect = myphp.conectar();
		notas = myphp.leerNota(connect);
		categorias = myphp.leerCategoria(connect);
		importancias = myphp.leerImportancia(connect);
		niveles = myphp.leerNiveles(connect);
		tipos = myphp.leerTipos(connect);
		usuarios = myphp.leerUsuarios(connect);
		
		for (Nota x:notas) {
			switch (x.getId_tipo_nota()) {
				case 1:
					TelcomboBox.addItem(x.getNombre_nota());
					break;
				case 2:
					ImgcomboBox.addItem(x.getNombre_nota());
					break;
				case 3:
					ReccomboBox.addItem(x.getNombre_nota());
					break;
				case 4:
					OtrcomboBox.addItem(x.getNombre_nota());
					break;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnNewButton) {
			Ver_Nota2 vernota = new Ver_Nota2();
			vernota.launcherVer_Nota2();
			frame.dispose();
		}
		if(e.getSource() == verimg) {
			int autor=0;
			int nivel=0;
			int categoria=0;
			int importancia=0;
			for(Nota x:notas) {
				if(ImgcomboBox.getSelectedItem().equals(x.getNombre_nota())){
					nombrenota.setText(x.getNombre_nota());
					contenidonota.setText(x.getDescripcion_nota());
					idnota.setText(String.valueOf(x.getId_nota()));
					fechanota.setText(x.getFecha_nota());
					autor = x.getId_usuario_nota();
					nivel = x.getId_nivel_nota();
					categoria = x.getId_categoria_nota();
					importancia = x.getId_importancia_nota();
					tiponota1 = x.getId_tipo_nota();
				}
			}
			for(Usuario x: usuarios) {
				if(autor == x.getIdUsuario()) {
					autornota.setText(x.getNombreMamalonMamalonzisimo());
					autornota.setVisible(true);
				}
			
			}
			
			for(Nivel x:niveles) {
				if(nivel == x.getId_nivel()) {
					nivelnota.setText(x.getNivel_nota());
					nivelnota.setVisible(true);
				}
			}
			for(Categoria x:categorias) {
				if(categoria ==x.getId_categoria()) {
					categorianota.setText(x.getNombre_categoria());
					categorianota.setVisible(true);
				}
			}
			for(Importancia x: importancias) {
				if(importancia == x.getId_importancia()) {
					importancianota.setText(x.nombre_importancia);
					importancianota.setVisible(true);
				}
			}
			for(Tipo x:tipos) {
				if(tiponota1 == x.getId_tipo()) {
					tiponota = x.getTipo_nota();
				}
			}
			btnNewButton_1.setEnabled(true);
			
		}
		
		if(e.getSource() == vertel) {
			int autor=0;
			int nivel=0;
			int categoria=0;
			int importancia=0;
			for(Nota x:notas) {
				if(TelcomboBox.getSelectedItem().equals(x.getNombre_nota())){
					nombrenota.setText(x.getNombre_nota());
					contenidonota.setText(x.getDescripcion_nota());
					idnota.setText(String.valueOf(x.getId_nota()));
					fechanota.setText(x.getFecha_nota());
					autor = x.getId_usuario_nota();
					nivel = x.getId_nivel_nota();
					categoria = x.getId_categoria_nota();
					importancia = x.getId_importancia_nota();
				}
			}
			for(Usuario x: usuarios) {
				if(autor == x.getIdUsuario()) {
					autornota.setText(x.getNombreMamalonMamalonzisimo());
					autornota.setVisible(true);
				}
			
			}
			
			for(Nivel x:niveles) {
				if(nivel == x.getId_nivel()) {
					nivelnota.setText(x.getNivel_nota());
					nivelnota.setVisible(true);
				}
			}
			for(Categoria x:categorias) {
				if(categoria ==x.getId_categoria()) {
					categorianota.setText(x.getNombre_categoria());
					categorianota.setVisible(true);
				}
			}
			for(Importancia x: importancias) {
				if(importancia == x.getId_importancia()) {
					importancianota.setText(x.nombre_importancia);
					importancianota.setVisible(true);
				}
			}
			for(Tipo x:tipos) {
				if(tiponota1 == x.getId_tipo()) {
					tiponota = x.getTipo_nota();
				}
			}
			btnNewButton_1.setEnabled(true);
		}
		
		if(e.getSource() == verrec) {
			int autor=0;
			int nivel=0;
			int categoria=0;
			int importancia=0;
			for(Nota x:notas) {
				if(ReccomboBox.getSelectedItem().equals(x.getNombre_nota())){
					nombrenota.setText(x.getNombre_nota());
					contenidonota.setText(x.getDescripcion_nota());
					idnota.setText(String.valueOf(x.getId_nota()));
					fechanota.setText(x.getFecha_nota());
					autor = x.getId_usuario_nota();
					nivel = x.getId_nivel_nota();
					categoria = x.getId_categoria_nota();
					importancia = x.getId_importancia_nota();
				}
			}
			for(Usuario x: usuarios) {
				if(autor == x.getIdUsuario()) {
					autornota.setText(x.getNombreMamalonMamalonzisimo());
					autornota.setVisible(true);
				}
			
			}
			
			for(Nivel x:niveles) {
				if(nivel == x.getId_nivel()) {
					nivelnota.setText(x.getNivel_nota());
					nivelnota.setVisible(true);
				}
			}
			for(Categoria x:categorias) {
				if(categoria ==x.getId_categoria()) {
					categorianota.setText(x.getNombre_categoria());
					categorianota.setVisible(true);
				}
			}
			for(Importancia x: importancias) {
				if(importancia == x.getId_importancia()) {
					importancianota.setText(x.nombre_importancia);
					importancianota.setVisible(true);
				}
			}
			
			btnNewButton_1.setEnabled(true);
		}
		
		if(e.getSource() == verotr) {
			int autor=0;
			int nivel=0;
			int categoria=0;
			int importancia=0;
			for(Nota x:notas) {
				if(OtrcomboBox.getSelectedItem().equals(x.getNombre_nota())){
					nombrenota.setText(x.getNombre_nota());
					contenidonota.setText(x.getDescripcion_nota());
					idnota.setText(String.valueOf(x.getId_nota()));
					fechanota.setText(x.getFecha_nota());
					autor = x.getId_usuario_nota();
					nivel = x.getId_nivel_nota();
					categoria = x.getId_categoria_nota();
					importancia = x.getId_importancia_nota();
				}
			}
			for(Usuario x: usuarios) {
				if(autor == x.getIdUsuario()) {
					autornota.setText(x.getNombreMamalonMamalonzisimo());
					autornota.setVisible(true);
				}
			
			}
			
			for(Nivel x:niveles) {
				if(nivel == x.getId_nivel()) {
					nivelnota.setText(x.getNivel_nota());
					nivelnota.setVisible(true);
				}
			}
			for(Categoria x:categorias) {
				if(categoria ==x.getId_categoria()) {
					categorianota.setText(x.getNombre_categoria());
					categorianota.setVisible(true);
				}
			}
			for(Importancia x: importancias) {
				if(importancia == x.getId_importancia()) {
					importancianota.setText(x.nombre_importancia);
					importancianota.setVisible(true);
				}
			}
			btnNewButton_1.setEnabled(true);
		}
		if(e.getSource()== btnNewButton_1) {
			Agregar_Nota2 sa = new Agregar_Nota2();
			sa.launcherAgregar_Nota2(Integer.parseInt(idnota.getText()), nivelnota.getText(),categorianota.getText(),importancianota.getText(),tiponota);
			System.out.println("Se envio el id " +Integer.parseInt(idnota.getText()));
			frame.dispose();
		}
	}
}
