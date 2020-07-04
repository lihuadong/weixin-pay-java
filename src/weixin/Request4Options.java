package weixin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Request4Options
 */
@WebServlet("/request/Request4Options")
public class Request4Options extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Request4Options() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doOptions(HttpServletRequest, HttpServletResponse)
	 */
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
