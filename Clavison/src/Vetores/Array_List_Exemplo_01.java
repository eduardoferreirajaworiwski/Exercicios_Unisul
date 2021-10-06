package Vetores;

import java.util.ArrayList;

public class Array_List_Exemplo_01 {
public static void main(String[] args) {
	ArrayList<Integer> numeros =  new ArrayList<Integer>();
	numeros.add(10);
	numeros.add(20);
	numeros.add(30);
	
	
	System.out.println("numeros.size() "+numeros.size());

for (Integer i=0; i<numeros.size(); i++) {
	System.out.println("Número: "+numeros.get(i));
	}
	
	
}
}
