package it.objectmethod.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.dao.CittaDaoImp;
import it.objectmethod.dao.EliminazioneDao;
import it.objectmethod.dao.NazioniDaoImp;


public class EliminazioneCittaServlet extends HttpServlet {

	protected void doGet (HttpServletRequest request, HttpServletResponse respons) {
   String SetLinkDelete = request.getParameter("ID");
   try {
		
		EliminazioneDao daoEli = new EliminazioneDao();
		
		request.setAttribute("citta",daoEli.deleteElemento(SetLinkDelete));
		request.getRequestDispatcher("ListNazioni.jsp").forward(request, respons);
		//ciao
	}
		
}

}