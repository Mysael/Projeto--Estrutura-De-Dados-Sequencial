package br.com.cesed.si.p3.testes;
import br.com.cesed.si.p3.classes.DequeFacisa;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
public class DequeTest {
	
	@Test
	public void adicionaNoComeco(){
		DequeFacisa dequeTeste = new DequeFacisa(3);
		dequeTeste.adicionaNoComeco("Objeto01");//4
		dequeTeste.adicionaNoComeco("Objeto02");//3
		dequeTeste.adicionaNoComeco("Objeto03");//2
		dequeTeste.adicionaNoComeco("Objeto04");//1
		dequeTeste.adicionaNoComeco("Objeto05");//0
		Assert.assertTrue(dequeTeste.verPrimeiro() == "Objeto05");
	}
	
	@Test
	public void adicionaNoFinal(){
		DequeFacisa dequeTeste = new DequeFacisa(2);
		dequeTeste.adicionaNoComeco("Objeto01");
		dequeTeste.adicionaNoComeco("Objeto02");
		dequeTeste.adicionaNoComeco("Objeto03");
		dequeTeste.adicionaNoComeco("Objeto04");
		dequeTeste.adicionaNoComeco("Objeto05");
		dequeTeste.adicionaNoFinal("ObjetoFinal");
		Assert.assertTrue(dequeTeste.verUltimo() == "ObjetoFinal");
	}
	
	@Ignore
	@Test
	public void removeNoComeco(){
		DequeFacisa dequeTeste = new DequeFacisa(2);
		dequeTeste.adicionaNoComeco("Objeto01");
		dequeTeste.adicionaNoComeco("Objeto02");
		dequeTeste.adicionaNoComeco("Objeto03");
		dequeTeste.adicionaNoComeco("Objeto04");//
		dequeTeste.adicionaNoComeco("Objeto05");//Objeto que está no começo
		dequeTeste.adicionaNoFinal("ObjetoFinal");
		dequeTeste.removeNoComeco();
		Assert.assertTrue(dequeTeste.verPrimeiro() == "Objeto05");
		
	}
	
	
	public void removeNoFinal(){
		
	}
}
