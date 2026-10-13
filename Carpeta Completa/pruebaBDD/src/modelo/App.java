package modelo;

import java.sql.Connection;

import dao.DAO;
public class App {

	public static void main(String[] args) {
		DAO miPrimerDao = new DAO();
		System.out.println(miPrimerDao.agregar());
		
	}

}
