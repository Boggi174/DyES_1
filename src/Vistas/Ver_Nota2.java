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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class Ver_Nota2 implements ActionListener{

	private JFrame frame;
	JTextField txtNombre;
	JTextPane textPane;
	JComboBox tipoComboBox;
	JComboBox importanciaComboBox;
	JComboBox categoriaComboBox;
	JComboBox nivelComboBox;
	Connection connect;
	DB_Connection myphp;
	ArrayList<Nota> notas;
	ArrayList<Categoria> categorias;
	ArrayList<Importancia> importancias;
	ArrayList<Nivel> niveles;
	ArrayList<Tipo> tipos;
	JButton btnNewButton ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ver_Nota2 window = new Ver_Nota2();
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
	public void launcherVer_Nota2() {
		Ver_Nota2 window = new Ver_Nota2();
		window.initializerip();
		window.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializerip() {
		frame = new JFrame();
		frame.setBounds(100, 100, 510, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton(">>");
		btnNewButton.setBounds(422, 519, 51, 50);
		btnNewButton.addActionListener(this);
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
		
		textPane = new JTextPane();
		textPane.setToolTipText("Contenido");
		textPane.setBounds(10, 188, 474, 392);
		frame.getContentPane().add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setBounds(10, 123, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tipoComboBox = new JComboBox();
		tipoComboBox.setBounds(47, 119, 109, 22);
		frame.getContentPane().add(tipoComboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Importancia:");
		lblNewLabel_2.setBounds(166, 123, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		importanciaComboBox = new JComboBox();
		importanciaComboBox.setBounds(237, 119, 80, 22);
		frame.getContentPane().add(importanciaComboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Categoria: ");
		lblNewLabel_3.setBounds(10, 148, 80, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		categoriaComboBox = new JComboBox();
		categoriaComboBox.setBounds(67, 144, 250, 22);
		frame.getContentPane().add(categoriaComboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Nivel:");
		lblNewLabel_4.setBounds(327, 123, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		nivelComboBox = new JComboBox();
		nivelComboBox.setBounds(359, 119, 99, 22);
		frame.getContentPane().add(nivelComboBox);
		
		
		myphp = new DB_Connection();
		connect = myphp.conectar();
		//notas = myphp.leerNota(connect);
		categorias = myphp.leerCategoria(connect);
		importancias = myphp.leerImportancia(connect);
		niveles = myphp.leerNiveles(connect);
		tipos = myphp.leerTipos(connect);
		for(Categoria x:categorias) {
			categoriaComboBox.addItem(x.getNombre_categoria());
		}
		for(Importancia x:importancias) {
			importanciaComboBox.addItem(x.getNombre_importancia());
		}
		for(Nivel x:niveles) {
			nivelComboBox.addItem(x.getNivel_nota());
		}
		for(Tipo x:tipos) {
			tipoComboBox.addItem(x.getTipo_nota());
		}
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnNewButton) {
			System.out.println("Boton Presionado!");
			int tipo_nota = 0;
			int importancia_nota = 0;
			int categoria_nota = 0;
			int nivel_nota = 0;
			int id_usuario = 1;
			String nombre_nota = txtNombre.getText();
			String descripcion_nota =  textPane.getText();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			String fecha_nota = dtf.format(now);
			
			System.out.println("Boton Presionado!");
			for (Tipo x : tipos) {
				
				if(tipoComboBox.getSelectedItem().equals(x.getTipo_nota())) {
				tipo_nota = x.getId_tipo();
				}
				
			}
			
			for (Importancia x : importancias) {
				
				if(importanciaComboBox.getSelectedItem().equals(x.getNombre_importancia())) {
				importancia_nota = x.getId_importancia();
				}
				
			}
			
			for (Categoria x : categorias) {
				
				if(categoriaComboBox.getSelectedItem().equals(x.getNombre_categoria())) {
				categoria_nota = x.getId_categoria();
				}
				
			}
			
			for (Nivel x : niveles) {
				
				if(nivelComboBox.getSelectedItem().equals(x.getNivel_nota())) {
				nivel_nota = x.getId_nivel();
				}
				
			}
			
		
			System.out.println("Se intercambiaron los datos! Tipo = " + tipo_nota+ " Importancia ="+importancia_nota+" Categoria= " +categoria_nota+ " Nivel =" +nivel_nota);
			myphp.addNota(nombre_nota, descripcion_nota, tipo_nota, importancia_nota, categoria_nota, fecha_nota, nivel_nota, id_usuario);
			System.out.println("Pusheado!");
			Pantalla_Principal2 sa = new Pantalla_Principal2();
			sa.launcherPantallaPrincipal2();
			frame.dispose();
		}
		
	}
}
