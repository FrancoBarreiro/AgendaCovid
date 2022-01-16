
package persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Conexion {
    
   private Connection conexion;
   
   public Conexion () throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
       Properties config=new Properties();
       config.load(new FileInputStream(new File("system.ini")));
       String driver=config.getProperty("DRIVER");
       String servidor=config.getProperty("SERVIDOR");
       String usuario=config.getProperty("USUARIO");
       String pass=config.getProperty("PASS");
       Class.forName(driver);
       conexion=DriverManager.getConnection(servidor,usuario,pass);
   }
 
   public ResultSet consulta(String sql) throws SQLException{
       Statement s=conexion.createStatement();
       return s.executeQuery(sql);
   }
   
   public PreparedStatement actualizar(String sql) throws SQLException{
       PreparedStatement s=conexion.prepareStatement(sql);
       return s;
   }
   
   public PreparedStatement consultaPrepare(String sql) throws SQLException{
       PreparedStatement s=conexion.prepareStatement(sql);
       return s;
   }
   
   
   
}
