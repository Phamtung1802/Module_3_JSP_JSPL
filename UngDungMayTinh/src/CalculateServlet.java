import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "CalculateServlet", urlPatterns = "/calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a=Integer.parseInt(request.getParameter("a"));
        int b=Integer.parseInt(request.getParameter("b"));
        String c=request.getParameter("operand");
        double result=Calculator.calculate(c,a,b);
        request.setAttribute("result", result);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculate.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
