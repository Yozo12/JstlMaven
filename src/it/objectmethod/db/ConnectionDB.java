package it.objectmethod.db;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class ConnectionDB {

	Connection con = null;
	
	public Connection getConnection() {
	
		
		try {
			
			InputStream input = ConnectionDB.class.getClassLoader().getResourceAsStream("config.properties");
			
			//caricamento e assegnazione File config.properties
			
			Properties prop = new Properties();
			prop.load(input);
			
			String user = prop.getProperty("user");
			String password=prop.getProperty("password");
			String url = prop.getProperty("url");
			String driver = prop.getProperty("driver");
			
		Class.forName(driver);

		// create a connection to the database
		con  = DriverManager.getConnection(url, user, password);	
		
		
		}
		catch(Exception e) {
			e.getStackTrace();
		}		
		
		return con;
		
	}


}
