package deveres_clavison;

import javax.swing.JOptionPane;


/*
 * Pe�a para o usu�rio digitar um n�mero inteiro positivo qualquer, digamos N. Ap�s calcule N!.
 */
public class Exercicio_09 {
	public static void main(String[] args) {
		int nr = Integer.parseInt(JOptionPane.showInputDialog("Informe n�mero"));
		int fat = 1;
		for (int i = 1; i <= nr; i++) {
			fat = fat *i;
		}
JOptionPane.showMessageDialog(null, "O resultado da fatorial �:"  +fat);
	}
}
