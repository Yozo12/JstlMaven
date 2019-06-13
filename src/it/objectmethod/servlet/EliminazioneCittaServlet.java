package it.objectmethod.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.dao.CittaDaoImp;


public class EliminazioneCittaServlet extends HttpServlet {

	protected void doGet (HttpServletRequest request, HttpServletResponse respons) {

		String elementoEliminare = request.getParameter("citta");

		try {

			CittaDaoImp deleteCitta = new CittaDaoImp();
				
		

		
			request.getRequestDispatcher("").forward(request, respons);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}

