package deveres_clavison;

import javax.swing.JOptionPane;

public class Exercicio_02{
	public static void main(String[] args) {
		String r = "Listagem de valores : \n\n";
		for(int i=10; i<=100; i+=10) {
			r = r + i + "\n";
		}
		JOptionPane.showMessageDialog(null, r);
	}
}


