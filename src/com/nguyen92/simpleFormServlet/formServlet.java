package com.nguyen92.simpleFormServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.net.URLEncoder;
import java.net.URLDecoder;

/**
 * Servlet implementation class formServlet
 */
@WebServlet("/formServlet")
public class formServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Step 1:  set content type
		response.setContentType("text/html");
		
		// Step 2:  get print writer
		PrintWriter out = response.getWriter();
		
		// Step 3: generate HTML code
		
		out.println("<html><body>");
		out.println("Successfully logged in as ");
		out.println(request.getParameter("firstName") + " " + request.getParameter("lastName"));
		out.println("<br/><br/>");
		out.println("<br/>Welcome to The Community!");
		
		// read form data
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String fullName = firstName + " " + lastName;
		String gender = request.getParameter("gender");
		String seeking = request.getParameter("seeking");
		String ethnicity = request.getParameter("ethnicity");
		String favMovie = request.getParameter("favMovie");
		String favAnimal = request.getParameter("favAnimal");
		String favHobby = request.getParameter("favHobby");
		
		// print out response page
		out.println("<h1 align=\"center\">My Profile</h1>");
		out.println("<h2>" + fullName + "</h2>");
		out.println(gender + " interested in " + seeking);
		out.println("<hr>");
		out.println("<h4>Ethnicity</h4>	"
				+ "<ul> "
				+ "<li>" + ethnicity 
				+ "</ul>");
		
		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
