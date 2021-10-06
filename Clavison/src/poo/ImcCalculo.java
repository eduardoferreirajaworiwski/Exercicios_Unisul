package poo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ImcCalculo {
public static void main(String[] args) {
	ArrayList<Pessoa> lista = new ArrayList<>();
	
	for(int i=0; i<5; i++) {
		Pessoa p = new Pessoa();
		p.calculoImc();
		lista.add(p);
	}
	
	String retorno = "";
	
	for(int i=0; i<lista.size(); i++) {
		retorno += lista.get(i).nome + " - "+ lista.get(i).calculoImc()+"\n";
	}
	
	JOptionPane.showMessageDialog(null, retorno);
}
}
