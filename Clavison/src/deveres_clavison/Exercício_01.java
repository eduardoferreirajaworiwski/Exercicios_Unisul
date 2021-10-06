package deveres_clavison;

import javax.swing.JOptionPane;

public class Exercício_01 {
	public static void main(String[] args) {
		String r = "Listagem de valores : \n\n";
		for(int i=1; i<=100; i++) {
			r = r + i + "\n";
		}
		JOptionPane.showMessageDialog(null, r);
       }
	}

