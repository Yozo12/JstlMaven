package it.objectmethod.dao;

import java.util.List;

import it.objectmethod.model.CityModel;

public interface CittaDaoI {
	
	public List<CityModel> getCitta(String x);
	public List<CityModel> getCittaDue(String x);
	public void setCitta(String citta);
	public String eliminazioneCitta(String x);

}
