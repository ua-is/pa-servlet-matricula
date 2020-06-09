package pe.edu.autonoma.matricula.controller;

import pe.edu.autonoma.matricula.conexion.Conexion;
import pe.edu.autonoma.matricula.dao.EstudianteDao;
import pe.edu.autonoma.matricula.entity.Estudiante;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

@WebServlet(name = "SaveStudentServlet", urlPatterns = "/savestudent")
public class SaveStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recibir la data del student
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Captura de los datos del formulario
        String apellidos = request.getParameter("apellidos");
        String nombres = request.getParameter("nombres");
        Integer edad = Integer.parseInt(request.getParameter("edad"));

        // Pasando los datos enviados al objeto
        Estudiante estudiante = new Estudiante(apellidos, nombres, edad);

        // Insertando al estudiante
        try {
            EstudianteDao dao = new EstudianteDao();
            dao.insert(estudiante);
        } catch (Exception e) {

        }

        // Creando una variable para enviar a otro archivo
        String respuesta = apellidos + ", " + nombres + " (" + edad + " años)";
        request.setAttribute("respuesta", respuesta);

        // El Request Dispatcher es utilizado para crear un despachar
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-estudent.jsp");
        requestDispatcher.forward(request, response);

        // Verificando que la conexión con ña DB funciona
        /*try {
            Connection conn = Conexion.openConnection();
            out.println("<p>TODO OK</p>");
            conn.close();
        } catch (Exception e) {
        }*/

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
