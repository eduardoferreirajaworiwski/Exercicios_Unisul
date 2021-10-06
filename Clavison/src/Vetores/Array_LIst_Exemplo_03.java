package Vetores;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Array_LIst_Exemplo_03 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Integer numero;
		Integer X;
		Integer qtde = 0;
		char opcao = 'S';
		while (opcao == 'S') {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Numero:"));
			numeros.add(numero);

			opcao = JOptionPane.showInputDialog("Tem mais alguem????").charAt(0);
		}

		X = Integer.parseInt(JOptionPane.showInputDialog("Numero para pesquisa"));

		for (Integer i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == X) {
				qtde++;
			}
		}

		if (qtde > 0) {
			System.out.println("Encontramos");
		} else {
			System.out.println("Não Encontramos");
		}
	}
}
