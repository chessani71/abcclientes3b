package abclientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BD {
public Connection conectar(){
    Connection conexion=null;
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/desm3b", 
                    "root", 
                    "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    return conexion;
}  


public String alta(String u,String p,String c,String n,String a){
    String res="";
    Connection conexion=null;
    try {
            conexion=conectar();
            Statement comando=conexion.createStatement();
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
              res="Usuario agregado";
            }
            else
            {
                 res= "Usuario Duplicado";
            }        
            conexion.close();
    } catch (SQLException ex) {
        Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
    }
    return res;
}
public void cerrar(Connection con){
    try{
    con.close();
    }
    catch(SQLException ex){
        ex.printStackTrace();
    }
}
}
