package view;

import model.Cliente;
import model.Fila;

public class Principal2 {

	public static void main(String[] args) {
		Fila<Cliente> fila = new Fila<Cliente>();
		Cliente c2 = new Cliente();
		Cliente c1 = new Cliente("Rafael", 1);
		
		c2.nome = "Fulano";
		c2.numero = 2;
		
		try {
			fila.insert(c1);
			fila.insert(c2);
			fila.list();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
