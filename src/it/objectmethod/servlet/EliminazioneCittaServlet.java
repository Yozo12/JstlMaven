package it.objectmethod.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.dao.CittaDaoImp;

public class EliminazioneCittaServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) {
		String setLinkCitta = request.getParameter("code");

		
		
		try {
			CittaDaoImp daoEli = new CittaDaoImp();
			request.setAttribute("citta",daoEli.eliminazioneCitta(setLinkCitta));
			request.getRequestDispatcher("/ListCittaServlet" ).forward(request, respons);

		}
		catch(Exception e) {

			e.printStackTrace();
		}
	}

}