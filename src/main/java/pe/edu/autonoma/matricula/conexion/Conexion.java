package pe.edu.autonoma.matricula.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static Connection conn;

    // Metodo para abrir la conexión a la base de datos
    public static Connection openConnection() {
        if ( conn != null )
            return conn;

        try {
            String usuario = "root";
            String password = "MySQL";
            String url = "jdbc:mysql://localhost:3306/matriculadb?useSSL=false&serverTimezone=UTC";

            // Establecer el Driver de conexión
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, usuario, password);

            System.out.println("Conexion establecida");

        } catch (Exception e) {
            System.out.println( e.getMessage() );
            System.out.println("Conexion Fallida");
        }
        return conn;
    }
    // Metodo para cerrar la conexion a la Base de datos
    public static void closeConnection() {
        try {
            if( conn != null ) {
                conn.close();
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
