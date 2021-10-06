package Vetores_Exercícios;

import javax.swing.JOptionPane;

/*
 * Faça um programa em que o usuário informe 3 números inteiros. Considere
que o usuário irá informar três números diferentes. Após o cadastro faça a ordenação em
ordem crescente desses números, de modo que o vetor original fique ordenado. Mostre o
vetor ordenado na tela.
 */
public class Ex2 {
public static void main(String[] args) {
	int n []= new int [3];
	for(int i =0; i<=3; i++) {
	int pedido = Integer.parseInt(JOptionPane.showInputDialog("Informe"));
	if (n[1]>n[2]) {
		
	}if(n[1]>n[3]) {
		
	}if(n[2]>n[1]) {
	
	}if(n[2]>n[3]) {
		
	}if(n[3]>n[1]) {
		
	}if(n[3]>n[2]) {
		
	}
	System.out.println("Ordem: "+n[1]+n[2]+n[3]);	
		
		
}
}
}
