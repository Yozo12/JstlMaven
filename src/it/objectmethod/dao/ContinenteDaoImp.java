package it.objectmethod.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import it.objectmethod.db.ConnectionDB;

public class ContinenteDaoImp implements ContinenteDaoI {


	public List<String> getContinenti() {

		String qry = "SELECT distinct continent  FROM country";

		ConnectionDB connection = new ConnectionDB(); //connessione al driver	

		try {
			PreparedStatement p = connection.getConnection().prepareStatement(qry);	//interrogazione driver

			ResultSet res = p.executeQuery(qry);

			List<String> al = new ArrayList<String>();

			while(res.next()) {

				al.add(res.getString("continent"));

			}
			
			p.close();
			res.close();
			connection.getConnection().close();
			
			return al;
		}
		catch(Exception e) {
			e.getStackTrace();
			return null;
		}



	}



}
