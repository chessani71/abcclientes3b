package abclientes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BDModelo {
    Connection conexion=null;
    public Connection conectar(){      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/desm3b", 
                    "root", 
                    ""); 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BDModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BDModelo.class.getName()).log(Level.SEVERE, null, ex);
                
        }   
        return conexion;
    }
    
    public String alta(String u,String p,String c,String n,String a){
        Statement comando;
        String movimiento="";
        try {
            comando = conexion.createStatement();
            ResultSet registro=
            comando.executeQuery("select * from tclientes where usuario='"+
                    u+"'");
            if (registro.next()==false){
            comando.executeUpdate("insert into tclientes values('"+
                    u+"','"+
                    p+"','"+
                    c+"','"+
                    n+"','"+
                    a+"')"
                    );
             movimiento="Usuario agregado";
            }
            else
            {
                 movimiento="Usuario Duplicado";
            }
             conexion.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(BDModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return movimiento;
    }
    
    public void cerrar(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(BDModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }