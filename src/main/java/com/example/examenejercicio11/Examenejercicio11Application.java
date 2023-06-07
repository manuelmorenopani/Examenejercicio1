package com.example.examenejercicio11;

import com.example.examenejercicio11.modelo.Factura;
import com.example.examenejercicio11.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Examenejercicio11Application implements CommandLineRunner {
	@Autowired
	private Factura s1;
	public static void main(String[] args) {
		SpringApplication.run(Examenejercicio11Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Producto c = new Producto("asdfasd", 2);

		System.out.println(s1.pagar(c));






	}
}
