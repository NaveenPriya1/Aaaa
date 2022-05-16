package flightbooking;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import phase2project.ConnectionUtil;

/**
 * Servlet implementation class ListOfFlights
 */
@WebServlet("/ListOfFlights")
public class ListOfFlights extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String departure = request.getParameter("departure");

		ConnectionUtil dao = null;
		try {
			dao = new ConnectionUtil();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List flights = dao.getAvailableFlights(from, to, departure);
		HttpSession session = request.getSession();
		session.setAttribute("flights", flights);

		
		response.sendRedirect("FlightList.jsp");
	}
}
