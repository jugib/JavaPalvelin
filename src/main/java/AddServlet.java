

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		int number1 = Integer.parseInt(request.getParameter("num1"));
		int number2 = Integer.parseInt(request.getParameter("num2"));
		int sum = number1 + number2;
		pw.println("sum of numbers is " + sum);
		
		
		
	}

}
