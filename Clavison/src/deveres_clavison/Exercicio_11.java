package deveres_clavison;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo para fazer a leitura de 10 nomes e idades de pessoas
 */
public class Exercicio_11 {

	public static void main(String[] args) {
		String tabela = "Tabela:";
		int qt = 10;
		for (int i = 0; i < qt; i++) {
			String nome = JOptionPane.showInputDialog((i + 1) + "º nome:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade de " + nome));
			JOptionPane.showMessageDialog(null, "Nome:"+ nome+ "\n"+ "Idade:" + idade);
		}

	}

}
