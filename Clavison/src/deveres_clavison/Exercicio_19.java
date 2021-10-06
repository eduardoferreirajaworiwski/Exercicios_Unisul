package deveres_clavison;

import javax.swing.JOptionPane;

public class Exercicio_19 {
	public static void main(String[] args) {
		String maisvelho = "";
		String maisnovo = "";
		int idademaisvelho = -1;
		int idademaisnovo = -1;
		int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
		for (int i = 0; i < qt; i++) {
			String nome = JOptionPane.showInputDialog((i + 1) + "Nome");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade de " + nome));
			if (idademaisnovo < idade) {
				
				
			idademaisnovo = idade;
			maisnovo = nome;
		}else {
			if(idademaisvelho>idade) {
				idademaisvelho=idade;
				maisvelho= nome;
			}
			System.out.println("Nome mais novo" +maisnovo + "Idade:" + idademaisnovo+ 
					"\n Nome mais velho:" +maisvelho + "Idade:"+ idademaisvelho);
		}
			
		}
	}
}
