package deveres_clavison;

import javax.swing.JOptionPane;

public class Exercicio_03 {
	/*
	 * Fa�a um algoritmo para mostrar na tela a seguinte seq��ncia de n�meros: 99 97
	 * 95 93 91...7 5 3 1.
	 */
	public static void main(String[] args) {
		String r = "Listagem de valores : \n\n";
		for(int i=99; i>=1; i-=2) {
			r = r + i + "\n";
		}
		JOptionPane.showMessageDialog(null, r);
		
       }

}
