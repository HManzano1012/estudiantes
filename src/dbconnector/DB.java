/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnector;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author haroldm
 */
public class DB {
	public static final String URL = "jdbc:mysql://localhost:3306/registro_academico";
	public static final String USER = "root";
	public static final String CLAVE = "hmanzano1012";

	public Connection getConexion() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return con;
	}
}
