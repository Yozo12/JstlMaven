package it.objectmethod.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.dao.CittaDaoImp;

public class ListCittaServlet  extends HttpServlet {
	protected void doGet (HttpServletRequest request, HttpServletResponse respons) {
		
		String setLinkCitta = request.getParameter("nazione");
		CittaDaoImp setcitta = new CittaDaoImp();
		
		setcitta.setCitta(setLinkCitta);
		
		try {			
			
			CittaDaoImp daoCitta = new CittaDaoImp();
			
			request.setAttribute("citta", daoCitta.getCitta(setLinkCitta));
			request.getRequestDispatcher("ListCitta.jsp").forward(request, respons);

		}
		catch(Exception e) {

			e.printStackTrace();
		}
		
	}

}
