package Vistas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DB_Connection {
	
	ArrayList<Usuario> Users  = new ArrayList<Usuario>();
	
	Connection connect;
    public static void main(String[] args) 
    {
 

    }
    
    public Connection conectar()
    {
        String servidor = "jdbc:mysql://localhost/case";
        String usuario = "testo";
        String password = "123";
        
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
        
        
        
        

}
