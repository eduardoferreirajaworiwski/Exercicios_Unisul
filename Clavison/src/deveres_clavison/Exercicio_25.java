package deveres_clavison;

import javax.swing.JOptionPane;

public class Exercicio_25 {
	public static void main(String[] args) {

		int n = 1;
		double media=0;
		double notas=0;

		for (int i = 1; i <= n; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
			int x = 1;

			for (int j = 1; j <= x; j++) {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + nome + ":"));
				notas+=nota;
				media = notas/j;
				
				int confirm = JOptionPane.showConfirmDialog(null, "Deseja adicionar outra nota?");

				if (confirm == 0) {
					x++;
				} else {
					j = x + 2;
				}				
			}
			
			JOptionPane.showMessageDialog(null, "A média do aluno(a) "+nome+" é: "+media);
			
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja calcular a média de outro aluno?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}
	}
}

	
