package deveres_clavison;

import javax.swing.JOptionPane;

public class Exercicio_06 {
	public static void main(String[] args) {
		int multi = 1;
		for (int i = 1; i <= 10; i++) {
            multi = multi * i;
			System.out.println("Numero: " + i);
			System.out.println("Multiplicado: " +multi);
			System.out.println("------------------------");
		}
	}
}
