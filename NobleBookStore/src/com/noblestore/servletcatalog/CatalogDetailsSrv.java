package com.noblestore.servletcatalog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CatalogDetails
 */
@WebServlet("/CatalogDetailsSrv")
public class CatalogDetailsSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatalogDetailsSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*PrintWriter writer = response.getWriter();
        writer.println("catalog details printed");
		System.out.println("catalog details printed");
*/
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value =request.getParameter("a1");

		HttpSession session = request.getSession();
	session.setAttribute("name", value);
	
	session.getAttributeNames();
	//request.getRequestDispatcher("Addtocart").forward(request, response);
		
		/*String[] values = request.getParameterValues("a1");*/
		response.sendRedirect("Addtocart.jsp");
		
		
	}

}
