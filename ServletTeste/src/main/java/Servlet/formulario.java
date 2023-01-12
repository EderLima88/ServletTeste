package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/formu")
public class formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public formulario() {
       
    }
	
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		
		request.setAttribute("nome", nome);
		request.setAttribute("idade", idade);
		
		request.getRequestDispatcher("view.jsp").forward(request, response);
		
		
		PrintWriter sai = response.getWriter();
		sai.println("<!DOCTYPE html>");
		sai.println("<html>");
		sai.println("<head>");
		sai.println("<body>");
		sai.println("Seu nome é " + nome + " e sua idade é " + idade);
		sai.println("</body>");
		sai.println("</html>");
    
    }

}
