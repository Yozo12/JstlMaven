package it.objectmethod.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.dao.NazioniDaoImp;

public class ListNazioniServlet extends HttpServlet{

	protected void doGet (HttpServletRequest request, HttpServletResponse respons) {
		
		String setLinkNazioni = request.getParameter("continente");
		
		try {
			
			NazioniDaoImp daoNazioni = new NazioniDaoImp();
			
			request.setAttribute("nazione", daoNazioni.getNazioni(setLinkNazioni));
			request.getRequestDispatcher("ListNazioni.jsp").forward(request, respons);
			
		}
		catch(Exception e) {

			e.printStackTrace();
		}
		
	}
}
