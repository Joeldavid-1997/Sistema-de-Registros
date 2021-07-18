package clases;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexionSqlite {

    Connection conexion;
    Statement consulta;
    String filePath;
    public String ruta;

    public ConexionSqlite() {
        filePath = new File("").getAbsolutePath();
        ruta = filePath + "/data/registro.db";
    }

    public void conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("controles.ConexionSqlite.conectar()" + ruta);
            conexion = DriverManager.getConnection("jdbc:sqlite:" + ruta);

            System.out.println("Conectado, OK!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionSqlite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        return conexion;
    }

}
