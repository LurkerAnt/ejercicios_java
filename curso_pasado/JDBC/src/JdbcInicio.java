import java.sql.*;

public class JdbcInicio {
	static String url="jdbj:mysql://localhost:3306/";
	static String bd="BD_EMPRESA";
	static String user= "root";
	static String pass="root";
	public static void main(String[] args) throws SQLException {
		
		String tabla="T_CENTROS";
		int codigo=1;
		String nombre ="jjjj";
		String insert=("INSERT INTO" + tabla + "VALUES(");
		insert+= codigo + ",";
		insert+="\""+nombre+"\"";
		insert+="\""
		
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
			Connection con = DriveManager.getConnection(url, user, password);
			System.out.println("Conexion establecida.");
			System.out.println(con.getCatalog());
			con.close();
			System.out.println("Conexion Cerrada.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}

}
