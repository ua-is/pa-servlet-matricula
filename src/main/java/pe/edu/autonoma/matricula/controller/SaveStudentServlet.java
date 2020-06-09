package pe.edu.autonoma.matricula.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SaveStudentServlet", urlPatterns = "/savestudent")
public class SaveStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recibir la data del student
        String apellidos = request.getParameter("apellidos");
        String nombres = request.getParameter("nombres");
        Integer edad = Integer.parseInt(request.getParameter("edad"));

        String respuesta = apellidos + ", " + nombres + " (" + edad + " años)";
        request.setAttribute("respuesta", respuesta);

        // El Request Dispatcher es utilizado para crear un despachar
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-estudent.jsp");
        requestDispatcher.forward(request, response);

        /*response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("");*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
