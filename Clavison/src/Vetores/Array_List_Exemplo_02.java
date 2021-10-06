package Vetores;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Array_List_Exemplo_02 {
public static void main(String[] args) {
	ArrayList<String> nomes = new ArrayList<String>();
    ArrayList<Integer>  idades = new ArrayList<Integer>();
    String nome;
    Integer idade;

    for(Integer i =1; i<=5; i++) {
        nome = JOptionPane.showInputDialog("Informe o nome");
        nomes.add(nome);
         idade = Integer.parseInt(
                JOptionPane.showInputDialog("Informe a idade"));
         idades.add(idade);
    }
    for(Integer i=0; i < nomes.size(); i++) {
        if(idades.get(i)>=18) {
            System.out.println("Nome: "+nomes.get(i));
        }
    }

}
}
