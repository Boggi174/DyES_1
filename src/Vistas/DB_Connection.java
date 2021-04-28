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
                   
                	String nombreUsuario = rs.getString("Nombre_Usuario");
                	String contraseniaUsuario = rs.getString("Contraseña_Usuario");
                	Long telefonoUsuario = rs.getLong("Telefono_Usuario");
                	String correoUsuario = rs.getString("Correo_Usuario");
                	int tipoUsuario = rs.getInt("Tipo_Usuario");
                	
                	Users.add(new Usuario(nombreUsuario,contraseniaUsuario,correoUsuario,telefonoUsuario,tipoUsuario));
                	
                	//System.out.println(rs.getString("Nombre_Usuario"));
                    
                }
            } catch(SQLException e)
            {
                e.printStackTrace();    
            
            }    
            return Users;
        }
        
        
        

}
