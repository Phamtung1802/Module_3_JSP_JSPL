import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculateServlet", urlPatterns = "/calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        double result;
//        result= Calculator.calculate(request.getParameter("operand"),Integer.parseInt(request.getParameter("a")),Integer.parseInt(request.getParameter("b")));
//        request.setAttribute("result",result);
//        RequestDispatcher dispatcher=  request.getRequestDispatcher("calculate.jsp");
//        dispatcher.forward(request,response);
        String fullName = "John John";

        request.setAttribute("nameT", fullName);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculate.jsp");

        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
