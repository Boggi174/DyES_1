package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Agregar_Nota2 implements ActionListener  {

	private JFrame frame;
	JTextField textField;
	JTextField textField_1;
	Connection connect;
	DB_Connection myphp;
	ArrayList<Nota> notas;
	ArrayList<Categoria> categorias;
	ArrayList<Importancia> importancias;
	ArrayList<Nivel> niveles;
	ArrayList<Tipo> tipos;
	ArrayList<Usuario> usuarios;
	JComboBox tipoComboBox;
	JComboBox importanciaComboBox;
	JComboBox categoriaComboBox;
	JComboBox nivelComboBox;
	JButton eliminarbtn;
	JButton btnNewButton;
	JLabel lblNewLabel_33;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agregar_Nota2 window = new Agregar_Nota2();
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
	public void launcherAgregar_Nota2(int idnota, String nivel, String categoria, String importancia, String tipo) {
		System.out.println("idnota entrada =" +idnota);
		Agregar_Nota2 window = new Agregar_Nota2();
		window.initializerip(idnota,nivel,categoria,importancia,tipo);
		window.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializerip(int idnota, String nivel, String categoria, String importancia, String tipo) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 510, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton(">");
		btnNewButton.setBounds(434, 543, 49, 40);
		btnNewButton.addActionListener(this);
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
		
		eliminarbtn = new JButton("Eliminar");
		eliminarbtn.setBounds(339, 560, 89, 23);
		eliminarbtn.addActionListener(this);
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
		
		categoriaComboBox = new JComboBox();
		categoriaComboBox.setBounds(67, 141, 250, 22);
		frame.getContentPane().add(categoriaComboBox);
		
		tipoComboBox = new JComboBox();
		tipoComboBox.setBounds(47, 116, 109, 22);
		frame.getContentPane().add(tipoComboBox);
		
		importanciaComboBox = new JComboBox();
		importanciaComboBox.setBounds(237, 116, 80, 22);
		frame.getContentPane().add(importanciaComboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Importancia:");
		lblNewLabel_2.setBounds(166, 120, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_33 = new JLabel(String.valueOf(idnota));
		lblNewLabel_33.setBounds(166, 120, 87, 14);
		lblNewLabel_33.setVisible(false);
		//lblNewLabel_33.setEnabled(false);
		lblNewLabel_33.setText(String.valueOf(idnota));
		frame.getContentPane().add(lblNewLabel_33);
		
		JLabel lblNewLabel_4 = new JLabel("Nivel:");
		lblNewLabel_4.setBounds(327, 120, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		nivelComboBox = new JComboBox();
		nivelComboBox.setBounds(359, 119, 99, 22);
		frame.getContentPane().add(nivelComboBox);
		
		
		myphp = new DB_Connection();
		connect = myphp.conectar();
		notas = myphp.leerNota(connect);
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
		for(Nota x:notas) {
			textField.setText(x.getNombre_nota());
			textField_1.setText(x.getDescripcion_nota());
		}
		importanciaComboBox.setSelectedItem(importancia);
		tipoComboBox.setSelectedItem(tipo);
		categoriaComboBox.setSelectedItem(categoria);
		nivelComboBox.setSelectedItem(nivel);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==eliminarbtn) {
			System.out.println("Se presiono el boton eliminar!");
			myphp.deleteNota(Integer.parseInt(lblNewLabel_33.getText()));
			Pantalla_Principal2 se = new Pantalla_Principal2();
			se.launcherPantallaPrincipal2();
			frame.dispose();
		}
		if(e.getSource()== btnNewButton) {
			String nombre_nota =textField.getText();
			String descripcion_nota=textField_1.getText();
			int id_tipo_nota =0;
			int id_importancia_nota =0;
			int id_categoria_nota = 0;
			int id_nivel_nota=0;
			int id_usuario_nota=1;
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			String fecha_nota = dtf.format(now);
	for (Tipo x : tipos) {
				
				if(tipoComboBox.getSelectedItem().equals(x.getTipo_nota())) {
				id_tipo_nota = x.getId_tipo();
				}
				
			}
			
			for (Importancia x : importancias) {
				
				if(importanciaComboBox.getSelectedItem().equals(x.getNombre_importancia())) {
				id_importancia_nota = x.getId_importancia();
				}
				
			}
			
			for (Categoria x : categorias) {
				
				if(categoriaComboBox.getSelectedItem().equals(x.getNombre_categoria())) {
				id_categoria_nota = x.getId_categoria();
				}
				
			}
			
			for (Nivel x : niveles) {
				
				if(nivelComboBox.getSelectedItem().equals(x.getNivel_nota())) {
				id_nivel_nota = x.getId_nivel();
				}
				
			}
			System.out.println("Se intercambiaron los datos! Tipo = " + id_tipo_nota+ " Importancia ="+id_importancia_nota+" Categoria= " +id_categoria_nota+ " Nivel =" +id_nivel_nota);
			System.out.println("Se presiono el boton actualizar!");
			myphp.updateNota(Integer.parseInt(lblNewLabel_33.getText()), nombre_nota, descripcion_nota, id_tipo_nota, id_importancia_nota, id_categoria_nota, fecha_nota, id_nivel_nota, id_usuario_nota);
			Pantalla_Principal2 se = new Pantalla_Principal2();
			se.launcherPantallaPrincipal2();
			frame.dispose();
		}
		
	}
}
