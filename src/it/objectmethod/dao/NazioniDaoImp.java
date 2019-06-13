package it.objectmethod.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import it.objectmethod.db.ConnectionDB;
import it.objectmethod.model.CountryModel;

public class NazioniDaoImp {

	public List<CountryModel> getNazioni(String x) {

		try {

			String qry = " select t1.name, t1.population, t1.code " + 
					" from country t1  " + 
					" where t1.continent=?";

			ConnectionDB connection = new ConnectionDB(); //connessione al driver			
			PreparedStatement p = connection.getConnection().prepareStatement(qry);	//interrogazione driver

			p.setString(1, x);
			ResultSet res = p.executeQuery();

			List<CountryModel> al = new ArrayList<CountryModel>();

			//Riempimento ArrayList

			while(res.next()) {

				CountryModel nazioni = new CountryModel();
				nazioni.setNazione(res.getString("Name"));		
				nazioni.setPopolazione(res.getInt("Population"));	
				nazioni.setCode(res.getString("code"));

				al.add(nazioni);

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