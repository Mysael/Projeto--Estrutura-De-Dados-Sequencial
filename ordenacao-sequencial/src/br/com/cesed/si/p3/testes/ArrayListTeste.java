package br.com.cesed.si.p3.testes;
import br.com.cesed.si.p3.classes.ArrayListFacisa;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListTeste {
	
	

	@Test
	public void add(){
		ArrayListFacisa listaDeArray = new ArrayListFacisa(3);
		listaDeArray.add("Objeto01");//1
		listaDeArray.add("Objeto02");//2
		listaDeArray.add("Objeto03");//3
		listaDeArray.add("Objeto04");//4
		listaDeArray.add("Objeto05");//5
		Assert.assertTrue(listaDeArray.size() == 5);
	}
	
	@Test
	public void remove(){
		ArrayListFacisa listaDeArray = new ArrayListFacisa(3);
		listaDeArray.add("Objeto01");//1
		listaDeArray.add("Objeto02");//2
		listaDeArray.add("Objeto03");//3
		listaDeArray.add("Objeto04");//4
		listaDeArray.add("Objeto05");//5
		listaDeArray.remove("Objeto04");//4
		Assert.assertTrue(listaDeArray.size() == 4);
	}
	
	@Test
	public void getByIndex(){
		ArrayListFacisa listaDeArray = new ArrayListFacisa(3);
		listaDeArray.add("Objeto01");//0
		listaDeArray.add("Objeto02");//1
		listaDeArray.add("Objeto03");//2
		listaDeArray.add("Objeto04");//3
		listaDeArray.add("Objeto05");//4
		Assert.assertTrue(listaDeArray.getByIndex(2) == "Objeto03");
	}
	
	@Test
	public void findPosition(){
		ArrayListFacisa listaDeArray = new ArrayListFacisa(3);
		listaDeArray.add("Objeto01");//0
		listaDeArray.add("Objeto02");//1
		listaDeArray.add("Objeto03");//2
		listaDeArray.add("Objeto04");//3
		listaDeArray.add("Objeto05");//4
		Assert.assertTrue(listaDeArray.findPosition("Objeto04") == 3);
	}	
	
}
