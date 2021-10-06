package deveres_clavison;

import javax.swing.JOptionPane;


/*
 * Peça para o usuário digitar um número inteiro positivo qualquer, digamos N. Após calcule N!.
 */
public class Exercicio_09 {
	public static void main(String[] args) {
		int nr = Integer.parseInt(JOptionPane.showInputDialog("Informe número"));
		int fat = 1;
		for (int i = 1; i <= nr; i++) {
			fat = fat *i;
		}
JOptionPane.showMessageDialog(null, "O resultado da fatorial é:"  +fat);
	}
}
