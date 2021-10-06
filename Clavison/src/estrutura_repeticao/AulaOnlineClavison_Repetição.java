package estrutura_repeticao;

import javax.swing.JOptionPane;

public class AulaOnlineClavison_Repetição {

	public static void main(String[] args) {

		int vl = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
	int soma = 0;
	for(int i=0; i<= 10; i+=2){
		soma = soma + i;
	}
		JOptionPane.showMessageDialog(null, "O valor da soma de " +vl+ " �:" + soma);
	}

}
