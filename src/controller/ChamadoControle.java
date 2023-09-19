package controller;

import model.Cliente;
import model.Fila;

public class ChamadoControle {

	public ChamadoControle() {
		super();
	}
	
	static int espera = 0;
	
	public void novaSenha(Fila f, int senha, String nome) {
		Cliente cliente = new Cliente();
		cliente.nome = nome;
		cliente.numero = senha;
		f.insert(cliente);
	}
	
	public void chamadaSenha (Fila f, Fila fp) throws Exception {
		Cliente chamado;
		if (espera<3 && !fp.isEmpty()) {
			try {
				chamado = (Cliente) fp.remove();
				System.out.println("Nome: "+ chamado.nome+"; Senha prioritária: "+chamado.numero);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			} finally {
				espera++;
			}
			
		}
		else {
			try {
				chamado = (Cliente) f.remove();
				System.out.println("Nome: "+ chamado.nome+"; Senha: "+chamado.numero);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			} finally {
				espera = 0;
			}
		}
		
	}

}
