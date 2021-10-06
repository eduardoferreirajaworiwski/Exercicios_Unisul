package deveres_clavison;

import javax.swing.JOptionPane;


public class Exercicio_16 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome");
		Integer qtdealunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos?"));
		Integer sexoMasculino=0;
		Integer sexoFeminino=0;
		char sexo;
		char M;
		char F;
		for (int i = 0; i < qtdealunos; i++) {
			nome = JOptionPane.showInputDialog("Nome");
			sexo = JOptionPane.showInputDialog("Sexo").charAt(0);
          if (sexo == 'M') {
        	  sexoMasculino++;
		}else 
			sexoFeminino++;
			
		}
	System.out.println("Masculino: " + sexoMasculino + "/nFeminino: " + sexoFeminino );
	}

}
