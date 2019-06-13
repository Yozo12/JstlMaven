package it.objectmethod.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import it.objectmethod.db.ConnectionDB;
import it.objectmethod.model.CityModel;

public class CittaDaoImp implements CittaDaoI {

	String citta;

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public List<CityModel> getCitta(String x) {

		String qry = "select  t2.Name, t2.population, t2.Id" + " from country t1 join city t2 on t1.Code=t2.CountryCode"
				+ " where t2.countrycode=?";

		try {

			ConnectionDB connection = new ConnectionDB(); // connessione al driver
			PreparedStatement p;
			p = connection.getConnection().prepareStatement(qry);

			p.setString(1, x);
			ResultSet res = p.executeQuery();

			List<CityModel> al = new ArrayList<CityModel>();

			// Riempimento ArrayList

			while (res.next()) {

				CityModel citta = new CityModel();
				citta.setCitta(res.getString("Name"));
				citta.setPopolazione(res.getInt("population"));
				citta.setId(res.getInt("Id"));

				al.add(citta);

			}

			p.close();
			res.close();
			connection.getConnection().close();

			return al;

		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
	}
	public List<CityModel> getCittaDue(String x) {

		String qry = "select  t2.Name, t2.population, t2.Id" + " from country t1 join city t2 on t1.Code=t2.CountryCode"
				+ " where t2.countrycode=?";

		try {

			ConnectionDB connection = new ConnectionDB(); // connessione al driver
			PreparedStatement p;
			p = connection.getConnection().prepareStatement(qry);

			p.setString(1, x);
			ResultSet res = p.executeQuery();

			List<CityModel> al = new ArrayList<CityModel>();

			// Riempimento ArrayList

			while (res.next()) {

				CityModel citta = new CityModel();
				citta.setCitta(res.getString("Name"));
				citta.setPopolazione(res.getInt("population"));
				citta.setId(res.getInt("Id"));

				al.add(citta);

			}

			p.close();
			res.close();
			connection.getConnection().close();

			return al;

		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
	}
	public String eliminazioneCitta(String x) {
		String qry = "delete city\r\n" + "from city\r\n" + "where id=?";

		try {

			ConnectionDB connection = new ConnectionDB(); // connessione al driver
			PreparedStatement p;
			p = connection.getConnection().prepareStatement(qry);
			p.setString(1, x);
			
			p.executeUpdate();
			p.close();
			connection.getConnection().close();
			
		} catch (Exception e) {
			e.getStackTrace();

		}
		return x;
		
	}
	
}
