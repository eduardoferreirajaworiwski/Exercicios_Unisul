package estrutura_repeticao_while;

import javax.swing.JOptionPane;

public class Enquanto_Clavison {
	public static void main(String[] args) {

		double mediam = 0;
		double mediaf = 0;
		char continua = 'S';
		char masculino = 'M';
		char feminino = 'F';
		while (continua == 'S') {
			String nome = JOptionPane.showInputDialog("Nome");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
			char sexo = JOptionPane.showInputDialog("Informe o sexo").toUpperCase().charAt(0);
			mediam = mediaf +Integer.parseInt("Informe a idade");
			continua = JOptionPane.showInputDialog("Mais numero?(S/N)").toUpperCase().charAt(0);
			
		}
		JOptionPane.showMessageDialog(null,"Média"+"\nMasculino: "+mediam+"\nFeminino: "+mediaf);
	}
}
