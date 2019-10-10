package cn.zdr;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletDemo4")
public class ServletDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init() throws ServletException {
		int count = 0;
		getServletContext().setAttribute("count", count);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int count = (Integer) getServletContext().getAttribute("count");
		count += 1;
		getServletContext().setAttribute("count", count);
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("<h1>欢迎光临本网站! 这是您第"+count+"次访问</h1>");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


}
