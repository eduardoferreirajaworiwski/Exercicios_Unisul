package deveres_clavison;

import javax.swing.JOptionPane;

public class Exercicio_15 {

	public static void main(String[] args) {
		int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos?"));
        int media = 1;      
        
        for (int i = 0; i < qt; i++) {
        	media = media + i ;
			String nome = JOptionPane.showInputDialog((i + 1) + "º nome:");
			double passei = Double.parseDouble(JOptionPane.showInputDialog("Media do" +  nome));
			if(passei >= 7.0) {
				JOptionPane.showMessageDialog(null, "Aprovado");
			}else { 
				if (passei <= 2.0) {
					JOptionPane.showMessageDialog(null, "Reprovado!");
				}else 
					if (passei >=2.0 && passei <=7.0) {
						JOptionPane.showMessageDialog(null, "Recuperação");
					}else {
						
						}
						if (passei >10 ) {
							JOptionPane.showMessageDialog(null, "Informe média real");
						}
					}
		}
	}

}

