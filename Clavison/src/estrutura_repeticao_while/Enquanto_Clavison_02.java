package estrutura_repeticao_while;

import javax.swing.JOptionPane;

public class Enquanto_Clavison_02 {
	public static void main(String[] args) {

		String menu = "1 - Adi��o \n" + "2 - Subtra��o \n" +"3 - Multiplica��o \n" + "4 - Divis�o \n" + "5 - Sair";
		int op = 0;
		while (op != 5) {
        op = Integer.parseInt(JOptionPane.showInputDialog(menu));
       
        
        switch (op) {
        case 1: double numero1 = Double.parseDouble(JOptionPane.showInputDialog("N�mero 1"));
                double numero2 = Double.parseDouble(JOptionPane.showInputDialog("N�mero 2"));
                double soma  = numero1 + numero2;
                JOptionPane.showMessageDialog(null, soma);
                break;
                
        case 2:  double numerosub = Double.parseDouble(JOptionPane.showInputDialog("N�mero 1"));
                 double numerosub1 = Double.parseDouble(JOptionPane.showInputDialog("N�mero 2"));
                 double subtração = numerosub - numerosub1;
                JOptionPane.showMessageDialog(null, subtração);
                break;
                
        case 3:  double numerom = Double.parseDouble(JOptionPane.showInputDialog("N�mero 1"));
                 double numerom1 = Double.parseDouble(JOptionPane.showInputDialog("N�mero 2"));
                 double multi = numerom *numerom1;
                 JOptionPane.showMessageDialog(null, multi);
                 break;
        case 4:  double numerod = Double.parseDouble(JOptionPane.showInputDialog("N�mero 1"));
                 double numerod1 = Double.parseDouble(JOptionPane.showInputDialog("N�mero 2"));
                 double divi = numerod / numerod1;
                 JOptionPane.showMessageDialog(null, divi);
               break;
        case 5 : JOptionPane.showMessageDialog(null, "Voc� escolheu a op��o sair"+ "\nClique em ok para fechar");

        }
        }
        
        
        
        
        
        
		}
	}

