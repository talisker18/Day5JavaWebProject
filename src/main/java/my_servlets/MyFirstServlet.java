package my_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h3>Accessing params of ServletConfig</h3>");
		
		ServletConfig config = super.getServletConfig(); //call getServletConfig() method GenericServlet class (you can also use this)
		out.print("Message: "+config.getInitParameter("Message")); //use the servlet config param
		
		out.print("<h3>Accessing params of ServletContext</h3>");
		ServletContext context = super.getServletContext();
		out.println("URL: "+context.getInitParameter("URL")+"\n");
		out.println("Driver name: "+context.getInitParameter("Driver"));
	}

}
