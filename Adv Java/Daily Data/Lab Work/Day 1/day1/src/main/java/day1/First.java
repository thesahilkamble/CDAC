package day1;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class First extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("In Init");
	}

	@Override
	public void destroy() {
		System.out.println("In Destroy");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		LocalTime l = LocalTime.now();

//		out.print("<h1>" + l.getHour() + ":" + l.getMinute() + ":"
//				+ (l.getSecond() < 10 ? "0" + l.getSecond() : l.getSecond()) + "</h1>");

//		out.print("<h1> Current Time: " + formatting(l.getHour()) + ":" + formatting(l.getMinute()) + ":"
//				+ formatting(l.getSecond()) + "</h1>");

		out.print("<h1> Current Time: " + formatting(l.getHour() % 12) + ":" + formatting(l.getMinute()) + ":"
				+ formatting(l.getSecond()) + (l.getHour() > 12 ? " PM" : " AM") + "</h1>");

	}

	public String formatting(int x) {
		return x < 10 ? "0" + x : "" + x;
	}

}
