package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
	private static String url= "jdbc:mysql://localhost:3306/";
	private static String user="root";
	private static String password="alumno";
	private static String baseDatos="PERSONAS";
	private static Connection conexionDB;
	
	public static Conexion conectar() {
		
		Class.forName("com.mysq.Driver");
			if (conexionDB==null) {
				try {
					conexionDB = DriverManager.getConnection(url+baseDatos,user,password);
				}catch (SQLException e) {
					System.out.println("La conexion no es válida.");
				}
		
			}
		return conexionDB;
		
	}
	
}
