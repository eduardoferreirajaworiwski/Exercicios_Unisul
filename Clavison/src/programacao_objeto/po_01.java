package programacao_objeto;

import javax.swing.JOptionPane;

public class po_01 {
	String nome;
	int altura;
	char sexo;
	
	void cadastra() {
		nome = JOptionPane.showInputDialog("Nome");
		altura=Integer.parseInt(JOptionPane.showInputDialog("Altura"));
		sexo = JOptionPane.showInputDialog("Sexo(M,F)").toUpperCase().charAt(0);
	}
}
