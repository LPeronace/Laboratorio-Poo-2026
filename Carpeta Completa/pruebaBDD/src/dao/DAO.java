package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DAO {
	String user = "root";
	String psw = "admin";

							//aca el puerto//aca va la bdd
	String path = "jdbc:mysql://localhost:3306/bd_53";
	
	
	public int agregar(){
		Connection conexion = null;
		int filas = 0;
		try {
			conexion = conectar();
			String sql = "INSERT INTO `tabla`(`idtabla`,`DNI`,nombre)VALUES('5','2','rafael')";
			Statement stmt = conexion.createStatement();
			filas = stmt.executeUpdate(sql);
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally {
			try {
				conexion.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}
		
		return filas;
	}
	
	public Connection conectar() {
		Connection conexion = null;
		try {
			//establece la conexion
			conexion = DriverManager.getConnection(path, user, psw);
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}
		
		return conexion;
	}
}
