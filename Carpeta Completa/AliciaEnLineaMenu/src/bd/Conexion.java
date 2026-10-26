package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Persona;



public class Conexion {
	String user = "root";
	String psw = "admin";

							//aca el puerto//aca va la bdd
	String path = "jdbc:mysql://localhost:3306/mibdohno";
	
	
	//ta mal no se como seguir me perdi :(
	public void eliminarPersona(int id) {
		String sql = ("DELETE FROM personas WHERE id ="+ id);
		Connection c = conectar();
		
		try {
			PreparedStatement stmt = c.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
			}
			
			rs.deleteRow();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public ArrayList<Persona> conseguirPersonas() {
		ArrayList<Persona> personas = new ArrayList<>();
		Persona p;
		Connection c = conectar();
		String sql = "SELECT * FROM personas;";
		
		try {
			Statement stmt = c.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				//el rs.getInt consigue el valor de la columna con el nombre puesto en el parametro en la fila actual
				int locura = rs.getInt("locura");
				int secreto = rs.getInt("secreto");
				int ubicacion = rs.getInt("ubicacion");
				
				p = new Persona(locura,secreto,ubicacion);
				
				
				personas.add(p);
			}
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
		
		
		return personas;
	}
	
	
	public void agregar(Persona p){
		Connection c = null;
		
		try {
			
			c = conectar();
			String sql = "INSERT INTO personas(locura,secretos,ubicacion)VALUES(?,?,?)";
			
			
			PreparedStatement stmt = c.prepareStatement(sql);
			stmt.setInt(1, p.getLocura());
			stmt.setInt(2, p.getSecreto());
			stmt.setInt(3, p.getUbicacion());
			System.out.println("hola");
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
}