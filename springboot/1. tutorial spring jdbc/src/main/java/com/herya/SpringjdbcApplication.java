package com.herya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) throws Exception {
		/*SpringApplication.run(SpringjdbcApplication.class, args);*/
	String url_allowXtr = "jdbc:oracle:thin:@//cbtgrdnblnp-scn.intra.excelcom.co.id:1522/SOADBDEV";
		Connection con = DriverManager.getConnection(url_allowXtr, "XLUATCONF03", "XLUATCONF03123");
		System.out.println("connection estabilished lancar jaya semoga bisa ............");

	}

}
