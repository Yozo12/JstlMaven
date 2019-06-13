package it.objectmethod.dao;

import java.sql.PreparedStatement;
import java.util.List;

import it.objectmethod.db.ConnectionDB;

public class EliminazioneDao implements EliminazioneDaoI{
 public void deleteElemento (String x) {
	 String qry ="delete  t1\r\n" + 
		 		"from city t1\r\n" + 
		 		"where t1.ID=?";
	 ConnectionDB connection = new ConnectionDB();
	 try {
			PreparedStatement p = connection.getConnection().prepareStatement(qry);	//interrogazione driver

		   p.executeUpdate(qry);
             
 }        
	 catch(Exception e) {
			e.getStackTrace();
			
		}
 
}
}