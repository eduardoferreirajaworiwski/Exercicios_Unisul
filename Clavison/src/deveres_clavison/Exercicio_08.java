package deveres_clavison;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo que peça para o usuário digitar dois valores inteiros positivos, digamos A e B. Após
calcule “A elevado ao expoente B”.
 */
public class Exercicio_08 {
	public static void main(String[] args) {
		int base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base"));
		int expoente = Integer.parseInt(JOptionPane.showInputDialog("Informe expoente"));
		int res = 1;
		for (int i = expoente; i >= 1; i--) {
			res = res * base;
		}
		JOptionPane.showMessageDialog(null, "Resultado:" + res);
	}
}
