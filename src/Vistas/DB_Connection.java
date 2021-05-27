package Vistas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DB_Connection {
	
	ArrayList<Usuario> Users  = new ArrayList<Usuario>();
	ArrayList<Nota> Notas = new ArrayList<Nota>();
	ArrayList<Categoria> Categorias = new ArrayList<Categoria>();
	ArrayList<Importancia> Importancias = new ArrayList<Importancia>();
	ArrayList<Nivel> Niveles = new ArrayList<Nivel>();
	ArrayList<Tipo> Tipos = new ArrayList<Tipo>();
	
	Connection connect;
    
    public Connection conectar()
    {
        String servidor = "jdbc:mysql://bfhjsyycssg5yj0r0sjg-mysql.services.clever-cloud.com/bfhjsyycssg5yj0r0sjg";
        String usuario = "ugjh5toqakdojsmz";
        String password = "VpYbp47qvOyhyH7MhjG3";
        
        try
        {
            connect = DriverManager.getConnection(servidor,usuario,password);
            
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        if(connect != null)
        {
           // System.out.println("Conexion exitosa!");
        }
        return connect;
    }
        
        public  ArrayList<Usuario> leerUsuarios(Connection connect)
        {
            PreparedStatement pstm = null;
            ResultSet rs = null;
            String query = "SELECT * FROM usuarios";
            try
            {
                pstm = connect.prepareStatement(query);
                rs = pstm.executeQuery();
               // System.out.println("Inicio de tabla ");
                while(rs.next())
                {
                   
                	int idUsuario = rs.getInt("ID_Usuario");
                	String nombreUsuario = rs.getString("Nombre_Usuario");
                	String contraseniaUsuario = rs.getString("Contraseña_Usuario");
                	Long telefonoUsuario = rs.getLong("Telefono_Usuario");
                	String correoUsuario = rs.getString("Correo_Usuario");
                	int tipoUsuario = rs.getInt("Tipo_Usuario");
                	
                	Users.add(new Usuario(idUsuario,nombreUsuario,contraseniaUsuario,correoUsuario,telefonoUsuario,tipoUsuario));
                	
                	//System.out.println(rs.getString("Nombre_Usuario"));
                    
                }
            } catch(SQLException e)
            {
                e.printStackTrace();    
            
            }    
            return Users;
        }
        public void addUsuario(String nombre, String contrasenia, String correo, Long telefono, int tipoCuenta ) {
            PreparedStatement pstm = null;
            ResultSet rs = null;
            String query = "INSERT INTO `usuarios`(`ID_Usuario`, `Nombre_Usuario`, `Contraseña_Usuario`, `Correo_Usuario`, `Telefono_Usuario`, `Tipo_Usuario`)  VALUES (NULL, '" + nombre +"', '"+ contrasenia+"', '" +correo+"', '"+telefono+"', '"+tipoCuenta+"')";
            try
            {
            	pstm = connect.prepareStatement(query);
                pstm.executeUpdate();
                
               
            } catch(SQLException e)
            {
                e.printStackTrace();    
            
            } 
        }
        
        public void updateUsuario(int idusuario,String nombre, String contrasenia, String correo, Long telefono, int tipoCuenta ) {
        	PreparedStatement pstm = null;
            ResultSet rs = null;
            String query = "UPDATE `usuarios`  SET `Nombre_Usuario` = '"+nombre+"', `Contraseña_Usuario` = '"+contrasenia+"', `Correo_Usuario` = '"+correo+"', `Telefono_Usuario` = '"+telefono+"', `Tipo_Usuario` = '"+tipoCuenta+ "' WHERE `usuarios`.`ID_Usuario` = " +idusuario;
            try
            {
            	pstm = connect.prepareStatement(query);
                pstm.executeUpdate();
                
               
            } catch(SQLException e)
            {
                e.printStackTrace();    
            
            } 
        }
        
        public void deleteUsuario(int idUsuario) {
        	 PreparedStatement pstm = null;
             ResultSet rs = null;
             String query = "DELETE  FROM usuarios WHERE `usuarios`.`ID_Usuario`= " +idUsuario;
             try
             {
             	pstm = connect.prepareStatement(query);
                 pstm.executeUpdate();
                 
                
             } catch(SQLException e)
             {
                 e.printStackTrace();    
             
             } 
        }
        
        
        public ArrayList<Nota> leerNota(Connection connect){
        	PreparedStatement pstm = null;
            ResultSet rs = null;
            String query = "SELECT * FROM nota_principal";
            try
            {
                pstm = connect.prepareStatement(query);
                rs = pstm.executeQuery();
               // System.out.println("Inicio de tabla ");
                while(rs.next())
                {
                   
                	int idNota = rs.getInt("ID_registro");
                	String nombre_nota = rs.getString("nombre");
                	String descripcion_nota = rs.getString("descripcion");
                	int id_tipo_nota = rs.getInt("ID_tipo");
                	int id_importancia_nota = rs.getInt("ID_importancia");
                	int id_categoria_nota = rs.getInt("ID_categoria");
                	String fecha_nota =rs.getString("fecha");
                	int id_nivel_nota = rs.getInt("ID_nivel");
                	int id_usuario_nota= rs.getInt("ID_Usuario");
                	
                	Notas.add(new Nota(idNota,nombre_nota,descripcion_nota, id_tipo_nota, id_importancia_nota,id_categoria_nota,fecha_nota,id_nivel_nota, id_usuario_nota));
                	
                	//System.out.println(rs.getString("Nombre_Usuario"));
                    
                }
            } catch(SQLException e)
            {
                e.printStackTrace();    
            
            }    
        	return Notas;
        	
        }
        
        public ArrayList<Categoria> leerCategoria(Connection connect){
        	PreparedStatement pstm = null;
            ResultSet rs = null;
            String query = "SELECT * FROM categoria_nota";
            try
            {
                pstm = connect.prepareStatement(query);
                rs = pstm.executeQuery();
               // System.out.println("Inicio de tabla ");
                while(rs.next())
                {
                   
                	int id_categoria = rs.getInt("ID_categoria");
                	String nombre_categoria = rs.getString("categoria_descripcion");
                
                	
                	Categorias.add(new Categoria(id_categoria,nombre_categoria));
                	
                	//System.out.println(rs.getString("Nombre_Usuario"));
                    
                }
            } catch(SQLException e)
            {
                e.printStackTrace();    
            
            }    
        	return Categorias;
        }
        
        public ArrayList<Importancia> leerImportancia (Connection connect){
        	PreparedStatement pstm = null;
            ResultSet rs = null;
            String query = "SELECT * FROM importancia_nota";
            try
            {
                pstm = connect.prepareStatement(query);
                rs = pstm.executeQuery();
               // System.out.println("Inicio de tabla ");
                while(rs.next())
                {
                   
                	int id_importancia = rs.getInt("ID_importancia");
                	String nombre_importancia = rs.getString("importancia_nota");
                
                	
                	Importancias.add(new Importancia(id_importancia,nombre_importancia));
                	
                	//System.out.println(rs.getString("Nombre_Usuario"));
                    
                }
            } catch(SQLException e)
            {
                e.printStackTrace();    
            
            }  
        	return Importancias;
        }
        
        public ArrayList<Nivel> leerNiveles(Connection connect){
        	
        	PreparedStatement pstm = null;
            ResultSet rs = null;
            String query = "SELECT * FROM nivel_nota";
            try
            {
                pstm = connect.prepareStatement(query);
                rs = pstm.executeQuery();
               // System.out.println("Inicio de tabla ");
                while(rs.next())
                {
                   
                	int id_nivel = rs.getInt("ID_nivel");
                	String nombre_nivel = rs.getString("nota_nivel");
                
                	
                	Niveles.add(new Nivel(id_nivel, nombre_nivel));
                	
                	//System.out.println(rs.getString("Nombre_Usuario"));
                    
                }
            } catch(SQLException e)
            {
                e.printStackTrace();    
            
            }  
        	return Niveles;
        }
        
        
        public ArrayList <Tipo> leerTipos(Connection connect){
        	PreparedStatement pstm = null;
            ResultSet rs = null;
            String query = "SELECT * FROM tipo_nota";
            try
            {
                pstm = connect.prepareStatement(query);
                rs = pstm.executeQuery();
               // System.out.println("Inicio de tabla ");
                while(rs.next())
                {
                   
                	int id_tipo = rs.getInt("ID_tipo");
                	String nombre_tipo = rs.getString("tipo");
                
                	
                	Tipos.add(new Tipo(id_tipo, nombre_tipo));
                	
                	//System.out.println(rs.getString("Nombre_Usuario"));
                    
                }
            } catch(SQLException e)
            {
                e.printStackTrace();    
            
            }  
        	
        	
        	return Tipos;
        }
        
        public void addNota(String nombre_nota, String descripcion_nota, int id_tipo_nota, int id_importancia_nota, int id_categoria_nota, String fecha_nota, int id_nivel_nota, int id_usuario_nota) {
        	 PreparedStatement pstm = null;
             ResultSet rs = null;
             String query = "INSERT INTO `nota_principal`(`ID_registro`, `nombre`, `descripcion`, `ID_tipo`, `ID_importancia`, `ID_categoria`, `fecha`, `ID_nivel`, `ID_Usuario`)  VALUES (NULL, '"
             +nombre_nota +"', '"+ descripcion_nota+"', '" +id_tipo_nota+"', '"+id_importancia_nota+"', '"+id_categoria_nota+"', '"+fecha_nota+"', '"+id_nivel_nota+"', '"+id_usuario_nota+"')";
             try
             {
             	pstm = connect.prepareStatement(query);
                 pstm.executeUpdate();
                 
                
             } catch(SQLException e)
             {
                 e.printStackTrace();    
             
             } 
        }
        
        public void updateNota(int idnota,String nombre_nota, String descripcion_nota, int id_tipo_nota, int id_importancia_nota, int id_categoria_nota, String fecha_nota, int id_nivel_nota, int id_usuario_nota) {
        	PreparedStatement pstm = null;
            ResultSet rs = null;
            String query = "UPDATE `nota_principal`  SET `nombre` = '"+nombre_nota+"', `descripcion` = '"+descripcion_nota+"', `ID_tipo` = '"+id_tipo_nota+"', `ID_importancia` = '"+id_importancia_nota+"', `ID_categoria` = '"+id_categoria_nota+ "', `fecha` = '"+fecha_nota+"', `ID_nivel` = '"+id_nivel_nota+"', `ID_Usuario` = '"+id_usuario_nota+"' WHERE `nota_principal`.`ID_registro` = " +idnota;
            try
            {
            	pstm = connect.prepareStatement(query);
                pstm.executeUpdate();
                
               
            } catch(SQLException e)
            {
                e.printStackTrace();    
            
            } 
        }
        
        public void deleteNota(int idnota) {
        	 PreparedStatement pstm = null;
             ResultSet rs = null;
             String query = "DELETE  FROM nota_principal WHERE `nota_principal`.`ID_registro`= " +idnota;
             try
             {
             	pstm = connect.prepareStatement(query);
                 pstm.executeUpdate();
                 
                
             } catch(SQLException e)
             {
                 e.printStackTrace();    
             
             } 
        }
        
        public void addCategoria(String categoria) {
        	 PreparedStatement pstm = null;
             ResultSet rs = null;
             String query = "INSERT INTO `categoria_nota`(`ID_categoria`, `categoria_descripcion`)  VALUES (NULL, '"
             +categoria +"')";
             try
             {
             	pstm = connect.prepareStatement(query);
                 pstm.executeUpdate();
                 
                
             } catch(SQLException e)
             {
                 e.printStackTrace();    
             
             } 
        	
        }

}
