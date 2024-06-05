package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class candidatelist
 */
@WebServlet("/candidatelistPage")
public class candidatelist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 resp.setContentType("text/html");
	 
	 try (PrintWriter p = resp.getWriter()) {
		 Cookie[] cookies = req.getCookies();
		 
		 if(cookies != null)
		 {
			 for(Cookie c:cookies)
			 {
				 p.print("<h3>Hello"+ c.getValue() +"<h1>Candidate List</h1>");
			 }
		 }
		}
}
}
