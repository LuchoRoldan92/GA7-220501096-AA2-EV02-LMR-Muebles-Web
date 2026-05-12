package servlet;

import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/ProductoServlet")
public class ProductoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter salida = response.getWriter();

        salida.println("<h1>Metodo GET funcionando</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String nombre =
                request.getParameter("nombre");

        String precio =
                request.getParameter("precio");
        
        String cantidad =
                request.getParameter("cantidad");

        response.setContentType("text/html");

        PrintWriter salida = response.getWriter();

        salida.println("<h1>Producto Guardado</h1>");

        salida.println("<p>Nombre: "
                + nombre + "</p>");

        salida.println("<p>Precio: "
                + precio + "</p>");
        
        salida.println("<p>Cantidad: "
                + cantidad + "</p>");
    }
}
