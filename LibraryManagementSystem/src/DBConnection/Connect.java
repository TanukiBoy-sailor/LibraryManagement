/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	
	private static final String URL = "jdbc:mysql://localhost:3306/bd_1";
	private static final String USER = "root";
	private static final String PASS = "Ingeniero11";
	
	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar controlador");
			e.printStackTrace();
			
		}
	}
	
	public Connection conectar() {
		
		Connection conexion = null;
		try {
			
			conexion = DriverManager.getConnection(URL, USER, PASS);
			//cadena de conexion, 
			
			System.out.println("Conectado Exitosamente a la base de datos");
			
		}  catch (SQLException e) {
			System.out.println("Error de conexion");
			e.printStackTrace();
		}
		
		return conexion;
	}
	
}

