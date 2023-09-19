package view;

import javax.swing.JOptionPane;

import controller.ChamadoControle;
import model.Cliente;
import model.Fila;

public class Principal {

	public static void main(String[] args) throws Exception {
		ChamadoControle c = new ChamadoControle();
		Fila<Cliente> fila = new Fila<>();
		Fila<Cliente> filaP = new Fila<>();
		int senha = 1, senhaP = 1;
		int X = 0;
		while (X!= 9) {
			X = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1 - Adicionar Senha\n2 - Adicionar Senha Prioritária\n3 - Chamar Senha\n9 - Fim"));
			switch (X) {
			case 1:
				String cliente = JOptionPane.showInputDialog("Insira o nome do cliente: ");
				c.novaSenha(fila, senha, cliente);
				senha++;
				System.out.println("Senha adicionada");
				break;
			case 2:
				String clienteP = JOptionPane.showInputDialog("Insira o nome do cliente: ");
				c.novaSenha(filaP, senhaP, clienteP);
				senhaP++;
				System.out.println("Senha prioritária adicionada");
				break;
			case 3:
				c.chamadaSenha(fila, filaP);
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Código Inválido");
				break;
			}
			
		}
		
	}

}
