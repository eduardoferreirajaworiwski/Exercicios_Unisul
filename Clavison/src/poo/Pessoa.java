package poo;

import javax.swing.JOptionPane;

public class Pessoa {
	String nome;
	Double altura;
	Double peso;
	void calculo() {
		nome = JOptionPane.showInputDialog("Nome");
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
	}
	Double calculoImc () {
		return peso/(altura*altura);
	}
}
