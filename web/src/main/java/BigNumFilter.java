
import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebFilter("/mutt")
public class BigNumFilter implements Filter {
	static int count = 0;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		count++;
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		if (req.getParameter("num1") == "" || req.getParameter("num2") == "")
			res.sendRedirect("NullArgumentsError.jsp");
		else {
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			int result = i * j;
			if (result > 100)
				request.setAttribute("isBig", "true");
			else
				request.setAttribute("isBig", "false");
			chain.doFilter(request, response);
		}
	}
	@Override		
	public void destroy() {
		System.out.println(count + " requests to the results page attempted");
	}

}
