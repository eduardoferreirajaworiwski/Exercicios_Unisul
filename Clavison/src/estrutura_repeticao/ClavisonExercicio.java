package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ClavisonExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int vl = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
		int soma = 0;
		
		for(int i = 2; i>=0; i-=2
				) {
			soma = soma + i;
		}
		
		JOptionPane.showMessageDialog(null, "Valor:" + soma);
    }
		
	}


