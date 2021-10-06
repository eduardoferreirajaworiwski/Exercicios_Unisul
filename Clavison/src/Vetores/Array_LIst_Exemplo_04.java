package Vetores;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Array_LIst_Exemplo_04 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Double> notas = new ArrayList<Double>();
		double media;
		double medias;
		String nome;
		String lista="";
		String listaR="";
		int op=0;
		
		char opcao = 'S';
		while (opcao == 'S') {
			nome = JOptionPane.showInputDialog("Informe nome");
			nomes.add(nome);
			media = Double.parseDouble(JOptionPane.showInputDialog("Informe média"));
			notas.add(media);
			opcao = JOptionPane.showInputDialog("Adicionar mais alguem").toUpperCase().charAt(0);
		}
		for (int i = 0; i < notas.size(); i++) {
			if(notas.get(i)>=7) {
				lista = lista +("------------\nNome - "+nomes.get(i)+"\nMedia: "+notas.get(i)+"------------");
			}else {
				listaR = listaR +("------------\nNome - "+nomes.get(i)+"\nMedia: "+notas.get(i)+"------------");
			}

		}
		JOptionPane.showMessageDialog(null, "\nAprovados: "+lista +"\n--------------"+"\nReprovados:"+listaR+"\n------------");

	}
}
