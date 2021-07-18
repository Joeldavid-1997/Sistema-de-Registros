package clases;

/**
 *
 * @author joarevalos
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMysql {

    Connection con;

    public ConexionMysql() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudjava?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=America/Asuncion", "root", "12345678");
            System.out.println("Conectado, OK!");
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
    }

    public Connection getConnection() {
        return con;
    }
}
