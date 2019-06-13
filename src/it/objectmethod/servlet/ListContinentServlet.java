package it.objectmethod.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.dao.ContinenteDaoImp;

public class ListContinentServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) {

		try {

			ContinenteDaoImp nomeContinente = new ContinenteDaoImp();

			List<String> al = new ArrayList<String>();

			int i = 0;

			while (i < nomeContinente.getContinenti().size()) {

				al.add(nomeContinente.getContinenti().get(i));
				i++;

			}

			request.setAttribute("nomeContinente", al);
			request.getRequestDispatcher("ListContinent.jsp").forward(request, respons);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
