import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.*;

@WebServlet(value = "/mutt",loadOnStartup=1)
public class AddServlet extends HttpServlet {
	static int count = 0;


	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		count++;
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int result = i * j;
		req.setAttribute("result", result);
		RequestDispatcher rd = req.getRequestDispatcher("Results.jsp");
		rd.forward(req, res);

	}

	@Override
	public void destroy() {
		System.out.println(count + " requests passed the filter");
		super.destroy();
	}

}
