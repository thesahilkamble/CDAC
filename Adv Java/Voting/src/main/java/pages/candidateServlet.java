package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CandidatelistImp;
import dao.UserDao;
import entities.User;

/**
 * Servlet implementation class candidatelist
 */
@WebServlet("/candidatelistPage")
public class candidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 resp.setContentType("text/html");
	 
	 try (PrintWriter p = resp.getWriter()) {
//		 Cookie[] cookies = req.getCookies();
		 HttpSession http = req.getSession();
		 
//		 UserDao voter = (UserDao)http.getAttribute("voter");
//		 CandidatelistImp candidate = (CandidatelistImp)http.getAttribute("candidate");
		
		 User tempUser = (User)http.getAttribute("tempUser");
		 if(tempUser != null) {
			 p.print("<h3> inside if of doGet in candidatelist</h3>");
		 }
		 
//		 if(cookies != null)
//		 {
//			 for(Cookie c:cookies)
//			 {
//				 if(c.getName() == "userinfo")
////				 p.print("<h3>Hello"+ c.getValue() +"<h1>Candidate List</h1>");
////					 p.print(c.getName());
//			 }
//		 }
		}
}
}
