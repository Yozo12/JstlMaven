package it.objectmethod.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.objectmethod.dao.CittaDaoImp;

public class ListCittaServlet extends HttpServlet {
	String setLinkCitta;
	boolean b;

	protected void doGet(HttpServletRequest request, HttpServletResponse respons) {

		if (b == false ) {

			setLinkCitta = request.getParameter("nazione");
			
            b=true;
		}
		
	
		HttpSession sessione = request.getSession();
		sessione.setAttribute("nazione", setLinkCitta);
		
		
    
		
		
		try {
           
			CittaDaoImp daoCitta = new CittaDaoImp();

			request.setAttribute("citta", daoCitta.getCitta(setLinkCitta));
			sessione.removeAttribute(setLinkCitta);
			sessione.invalidate();
			request.getRequestDispatcher("ListCitta.jsp").forward(request, respons);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	
	}
}