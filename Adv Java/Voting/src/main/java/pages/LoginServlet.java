package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CandidatelistImp;
import dao.UserDao;
import dao.UserDaoImp;
import entities.User;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(value = "/login", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImp user;
	private CandidatelistImp candidate;
//	private User tempUser;
	
	@Override
		public void init() throws ServletException {
			System.out.println("in init");
			try {
				user = new UserDaoImp();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				throw new ServletException("err in init of " + getClass(), e);
				}
		}
	
	@Override
	public void destroy() {
		System.out.println("in destroy");
		try {
			user.cleanUp();
		} catch (SQLException e) {
			System.out.println("err in destroy");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		
		try (PrintWriter p = resp.getWriter()) {
			String mail =req.getParameter("em");
			String pass =req.getParameter("pass");
			
			User tempUser = user.SignIn(mail, pass);
			
			if(tempUser == null)
			{
				p.print("<h1>Invalid Login ,<a href = 'Login.html' Please Login again</a>");
			}
		
			else {
//				Cookie c = new Cookie("userinfo", tempUser.toString());
				
//				resp.addCookie(c);
				
				HttpSession httpSession = req.getSession();
				
				httpSession.setAttribute("voter", tempUser);
				httpSession.setAttribute("user", user);
				httpSession.setAttribute("candidate", candidate);
				
				if(tempUser.getRole().equals("admin"))
				{
					resp.sendRedirect("adminPage");
				}
				
				else {
					if(tempUser.isStatus())
					{
						resp.sendRedirect("logoutPage");
					}
					else {
//						p.print(tempUser.toString());
						resp.sendRedirect("candidatelistPage");
					}
				}
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
