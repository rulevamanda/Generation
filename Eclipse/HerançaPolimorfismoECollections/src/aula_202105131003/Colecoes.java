package aula_202105131003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
//import java.util.*;//importar tudo de uma vez (não é aconselhado)

public class Colecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		
		for(Integer lista:minhaLista) {
			System.out.println(lista);
		}
		
		System.out.println("\nRemovendo um elemento da lista: ");
		System.out.println();
		minhaLista.remove(0);//passa o índice, não o valor que quer remover
		
		for(Integer lista:minhaLista) {
			System.out.println(lista);
		}
		
		int primeiroElemento = minhaLista.get(0);//pega o valor do índice que está entre parênteses
		
		System.out.println("\nOp rimeiro elemento é: "+primeiroElemento);
		
		for(int i=0;i<minhaLista.size();i++) {
			System.out.println("\nElemento: "+minhaLista.get(i));//+minhaLista.get(0);
		}
		
		Collections.sort(minhaLista);
		System.out.println("\nLista depois de ordenada:");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set <Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(1);
		
		//meuSet.addAll(minhaLista);
		
		Iterator <Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());//vai pegando e mostrando o próximo elemento
		}
	}

}
