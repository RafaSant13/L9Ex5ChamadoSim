package view;

import model.Fila;

public class Principal3 {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		try {
			fila.insert(1);
			fila.insert(2);
			fila.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
