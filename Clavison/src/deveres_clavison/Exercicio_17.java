package deveres_clavison;

import javax.swing.JOptionPane;

public class Exercicio_17 {
	public static void main(String[] args) {
		int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
		String Jaguaruna;
		int idadedezessete = 17;

		for (int i = 0; i < qt; i++) {
			String nome = JOptionPane.showInputDialog((i + 1) + "� nome:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade de" + nome));
			String tubarão = JOptionPane.showInputDialog("Vive em tubar�o");
			String Jaguaruna1 =JOptionPane.showInputDialog("Vive em Jaguaruna?");

			if (tubarão != Jaguaruna1) {
			{

			}
			if (idadedezessete < idade) {
				System.out.println("Alunos que residem em tubar�o" + tubarão + "Alunos que residem em jaguaruna"
						+ Jaguaruna1 + "Alunos com 17 anos ou menos" + idadedezessete);
			}
		}
	}
}
}
