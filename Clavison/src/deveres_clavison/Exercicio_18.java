package deveres_clavison;

import javax.swing.JOptionPane;

public class Exercicio_18 {
	public static void main(String[] args) {

		double menorNumero = 0;

		double qt = Double.parseDouble(JOptionPane.showInputDialog("Quantos números?"));

		for (double i = 0; i < qt; i++) {
			double numero = Double.parseDouble(JOptionPane.showInputDialog((i + 1) + "Numero"));
			if (menorNumero > numero) {
				menorNumero = numero;
			}
		}

		JOptionPane.showMessageDialog(null, "Menor número:" + menorNumero);
	}
}
