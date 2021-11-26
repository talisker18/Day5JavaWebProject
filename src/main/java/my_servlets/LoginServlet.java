package my_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("you clicked me (welcome page...)");
	}*/
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("you clicked me (post form...)");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
		
		if(username.equals("admin") && password.equals("123")) {
			rd = request.getRequestDispatcher("WelcomeServlet"); //for forwarding to this Servlet
			rd.forward(request, response); //what do we want to forward...allways request and response!
			
		}else {
			rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response); //include is necessary to show the login.jsp again. And we could access the username and password
			//in login.jsp...see example in login.jsp
			
			out.println("<h3 style='color:red;'>invalid credentials</h3>");
			out.println("are you sure you have used correct username? : ");
			
		}
	}

}
