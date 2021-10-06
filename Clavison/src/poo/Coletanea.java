package poo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Coletanea {
	public static void main(String[] args) {
		ArrayList<Colecao> lista = new ArrayList<>();
		Integer qt[]=new Integer[100];
		String menu = "Menu da coletânea:" + "\n1-Cadastro de DVD" + "\n2-Listar todos" + "\n3-SomarValores"
				+ "\n4-Procura por ano de lançamento" + "\n5-Procura por título" + "\n6-Sair";
		String cadastroDVD="";
		double precoDVD = -1.0;
		int anoDVD = -1;
		int op = 0;
		Double soma = 0.0;
		while (op != 5) {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastroDVD = JOptionPane.showInputDialog("Informe o título");
				anoDVD = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
				precoDVD = Double.parseDouble(JOptionPane.showInputDialog("Preço"));

				break;

			case 2:
				for (int i = 0; i < lista.size(); i++) {
					String resultado = "";
					Colecao c = new Colecao();
					lista.add(c);
					Colecao a = new Colecao();
					lista.add(a);
					Colecao p = new Colecao();
					lista.add(p);
					resultado += lista.get(i).titulo + " -- ";
				}
				break;

			case 3:
				for (int i = 0; i < 10; i++) {
					soma = soma + precoDVD;
					JOptionPane.showMessageDialog(null, "A Soma final foi de: " + soma);
				}
				break;

			case 4:
				Integer anoBusca = Integer.parseInt(JOptionPane.showInputDialog("Qual nome deseja buscar?"));
				boolean achouAno = false;
				for (int i = 0; i < qt[i]; i++) {
					if (anoBusca == anoDVD) {
						achouAno = true;
					}
					if (achouAno == true) {
						JOptionPane.showMessageDialog(null, anoBusca + "está cadastrado(a)" +cadastroDVD);
					} else {
						JOptionPane.showMessageDialog(null, anoBusca + "não encontrado");
					}
				}
				break;
			case 5:
				String tituloBusca = JOptionPane.showInputDialog("Qual nome deseja buscar?");
				boolean achouTitulo = false;
				for (int i = 0; i < 5; i++) {
					if (tituloBusca.equals(cadastroDVD)) {
						achouTitulo = false;
					}
					if (achouTitulo == true) {
						JOptionPane.showMessageDialog(null, tituloBusca + "está cadastrado(a)");
					} else {
						JOptionPane.showMessageDialog(null, tituloBusca + "não encontrado");
					}
				}
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Você escolheu sair!");
				break;
				default: JOptionPane.showMessageDialog(null, "Número errado!");
				break;
			}
		}

	}
}
