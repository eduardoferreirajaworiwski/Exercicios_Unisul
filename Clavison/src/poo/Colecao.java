package poo;

import javax.swing.JOptionPane;

public class Colecao {
	public static String titulo;
	String título;
	Integer anodeLancamento;
	Double preço;

	void pesquisa() {
		título = JOptionPane.showInputDialog("Nome do DVD");
		anodeLancamento = Integer.parseInt(JOptionPane.showInputDialog("Ano de lançamento"));
		preço = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
 
    }
	}

