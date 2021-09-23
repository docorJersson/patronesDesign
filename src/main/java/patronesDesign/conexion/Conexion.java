package patronesDesign.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private String url;
	private String password;
	private String user;
	private static Connection con;

	private Conexion() {
		this.url = "jdbc:mysql://localhost:3306/eurekabank";
		this.user = "root";
		this.password = "";

		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConexion() throws SQLException {
		if (con == null || con.isClosed()) {
			new Conexion();
		}
		return con;
	}

	public static void disconnect() throws SQLException {
		if (con != null || !con.isClosed()) {
			con.close();
		}
	}
}
