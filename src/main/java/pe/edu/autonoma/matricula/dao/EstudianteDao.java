package pe.edu.autonoma.matricula.dao;

import pe.edu.autonoma.matricula.conexion.Conexion;
import pe.edu.autonoma.matricula.entity.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EstudianteDao {
    private Connection conn;

    public EstudianteDao() {
        conn = Conexion.openConnection();
    }

    public void insert(Estudiante estudiante) {
        try {
            // Creando la instrucción SQL
            String sql = "INSERT INTO estudiante (apellidos, nombres, edad) " +
                    "VALUES (?, ?, ?)";
            // Preparar la intrucción sql para su ejecución
            PreparedStatement ps = conn.prepareStatement(sql);
            // Reemplazando las ? por valores reales
            ps.setString(1, estudiante.getApellidos());
            ps.setString(2, estudiante.getNombres());
            ps.setInt(3, estudiante.getEdad());

            // Ejecuta la instrucción SQL
            ps.executeUpdate();
            // cierra la conexion a la BD
            ps.close();

        } catch(Exception e) {

        }
    }

}
