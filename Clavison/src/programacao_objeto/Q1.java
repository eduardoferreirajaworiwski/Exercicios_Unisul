package programacao_objeto;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Q1 {
public static void main(String[] args) {
	    
	ArrayList<po_01> alunos = new ArrayList<>();
	
	String menu = "1 - Cadastrar Alunos\n"
			+ "2 - Aluno mais alto(a)\n"
			+ "3 - Mulheres com altura acima da média\n"
			+ "4 - Pessoas com altura abaixo da média\n"
			+ "5 - SAIR";
	int op = 0;
	
	do {
		op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch (op) {
		case 1:
			po_01 a = new po_01();
			a.cadastra();
			alunos.add(a);
			break;
		case 2:
			po_01 alunoMaisAlto = new po_01();
			for(int i=0; i<alunos.size(); i++) {
				if(alunos.get(i).altura > alunoMaisAlto.altura) {
					alunoMaisAlto = alunos.get(i);
				}
			}
			JOptionPane.showMessageDialog(null, alunoMaisAlto.nome);
			break;
		case 3:
			int somaAlturas = 0;
			int qtMulheres = 0;
			for(int i=0; i<alunos.size(); i++) {
				if(alunos.get(i).sexo == 'F') {
					somaAlturas += alunos.get(i).altura;
					qtMulheres ++;
				}
			}
			
			if(qtMulheres == 0)
				qtMulheres = 1;
			
			double mediaAlturasF = somaAlturas / qtMulheres;
			
			String nomesFmaisAltas = "Mulheres mais altas que a média\n";
			for(int i=0; i<alunos.size(); i++) {
				if(alunos.get(i).sexo=='F' && alunos.get(i).altura > mediaAlturasF) {
					nomesFmaisAltas += alunos.get(i).nome+"\n";
				}
			}
			JOptionPane.showMessageDialog(null, nomesFmaisAltas);
			break;
		case 4:
			int somaTodasAlturas = 0;
			for(int i=0; i<alunos.size(); i++) {
				somaTodasAlturas += alunos.get(i).altura;
			}
			double mediaTodasAlturas = somaTodasAlturas / alunos.size();
			String pessoasBaixoMedia = "Pessoas mais baixas que a média\n";
			for(int i=0; i<alunos.size(); i++) {
				if(alunos.get(i).altura < mediaTodasAlturas) {
					pessoasBaixoMedia += alunos.get(i).nome+"\n";
				}
			}
			JOptionPane.showMessageDialog(null, pessoasBaixoMedia);
			break;

		}
		
	}while(op!=5);
	
	
	
}

}

