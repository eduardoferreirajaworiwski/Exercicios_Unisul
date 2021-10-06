package Vetores;

import javax.swing.JOptionPane;

/*
 * //************** EXERCÍCIO ***********************
3 – Faça um algoritmo para cadastro de nomes e telefones de pessoas (no máximo 100 pessoas) e que apresente 
o seguinte menu (com as respectivas funcionalidades):

1 – Cadastrar contato 
2 – Buscar contato por nome
3 – Buscar contato por telefone
4 – sair
 */
public class Array_Exercicio_01 {
	public static void main(String[] args) {
		String menu = "Qual opção deseja?" + "\n1-Cadastrar contato" + "\n2-Buscar contato por nome"
				+ "\n3-Buscar contato por telefone" + "\n4-Sair";

		String nomes[] = new String[100];
		String telefones[] = new String[100];
		int op=0;
		int in = 0;
		int it = 0;
			while (op != 4) {
	        op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			
			switch (op) {
			case 1:
				nomes[in] = JOptionPane.showInputDialog("Informe o" + (in + 1) + " nome a ser cadastrado");
				telefones[it] = JOptionPane.showInputDialog("Informe o telefone");
				in++;
				it++;
				break;

			case 2:
				int tituloBusca = Integer.parseInt(JOptionPane.showInputDialog("Qual nome deseja buscar?"));
				boolean achou = false;
				for (int i = 0; i < in; i++) {
					if (cadastroDVD.equals(nmBusca)) {
						achou = true;
					}
					if (achou == true) {
						JOptionPane.showMessageDialog(null, nmBusca + "está cadastrado(a)");
					} else {
						JOptionPane.showMessageDialog(null, nmBusca + "não encontrado");
					}
				}
				break;

			case 3:
				String telBusca = JOptionPane.showInputDialog("Informe o telefone");
				boolean achouTel = false;
				for (int i = 0; i < 100; i++) {
					if (telefones[i] == (telBusca)) {
						achouTel = true;

					}
					if (achouTel = true) {
						JOptionPane.showMessageDialog(null, telBusca + "encontrado");
					} else {
						JOptionPane.showMessageDialog(null, telBusca + "não encontrado");
					}
				}
			}
			break;

		}

		{

		}
	}
}
