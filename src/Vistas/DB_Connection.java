package Vistas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DB_Connection {
	
	Connection connect;
    public static void main(String[] args) 
    {
    	DB_Connection con = new DB_Connection();
        con.conectar();
        con.leer();

    }
    
    private void conectar()
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
            System.out.println("Conexion exitosa!");
        }
    }
        
        private void leer()
        {
            PreparedStatement pstm = null;
            ResultSet rs = null;
            String query = "SELECT * FROM usuarios";
            try
            {
                pstm = connect.prepareStatement(query);
                rs = pstm.executeQuery();
                System.out.println("Inicio de tabla ");
                while(rs.next())
                {
                    System.out.println(rs.getString("Nombre_Usuario"));
                    
                }
            } catch(SQLException e)
            {
                e.printStackTrace();    
            
            }    
        
        }

}
