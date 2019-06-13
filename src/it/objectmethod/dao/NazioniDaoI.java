package it.objectmethod.dao;

import java.util.List;

import it.objectmethod.model.CountryModel;

public interface NazioniDaoI {
	
	public List<CountryModel> getNazioni(String x);

}
