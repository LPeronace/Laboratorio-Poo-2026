package bdd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Alumno;

public class Conexion {
	String user = "root";
	String psw = "admin";

								//aca el puerto//aca va la bdd
	String path = "jdbc:mysql://localhost:3306/tpfinalpoo";
		
		
	public Connection conectar() {
		Connection c = null;
		try {
			//establece la conexion
			c = DriverManager.getConnection(path, user, psw);
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}
		
		return c;
	}
	
	public ArrayList<String> elementosComboBox() {
		ArrayList<String> elementos = new ArrayList<>();
		Connection c = conectar();
		
		String sql = "SELECT * FROM estudios";
		try {
			Statement stmt = c.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String nombre = rs.getString("nombre");
				
				elementos.add(nombre);
			}
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
		return elementos;
	}
	
	public void agregarAlumno(Alumno a) {
		Connection c = conectar();
		//	String sql = "INSERT INTO `tabla`(`idtabla`,`DNI`,nombre)VALUES('5','2','rafael')";
		String sql = "INSERT INTO personas(nombre,nacimiento,hijoas,idEstudio,DNI)VALUES(?,?,?,?,?)";
		try {
			PreparedStatement stmt = c.prepareStatement(sql);
			
			Date fecha = Date.valueOf(a.getFecha());
			
			stmt.setString(1, a.getNombre());
			stmt.setDate(2, fecha);
			stmt.setBoolean(3, a.getTieneHijo());
			stmt.setInt(4,a.getIdEstudio());
			stmt.setString(5,a.getDni());
			
			stmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally {
			try {
				c.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}
		
	}

}
