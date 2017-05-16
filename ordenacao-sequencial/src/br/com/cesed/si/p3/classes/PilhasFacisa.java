package br.com.cesed.si.p3.classes;

/**
 * implementando funcionamento de pilhas
 * @author Mysael
 */

public class PilhasFacisa {
	private Object [] minhaPilhaInterna;
	int qntElementos = 0;
	
	
	public PilhasFacisa(int tamanho){
		this.minhaPilhaInterna = new Object[tamanho];
	}
	
	/**
	 * método push que adiciona elemento na pilha
	 * @param recebe um objeto
	 */
	public void push (Object o){
		if (minhaPilhaInterna.length == qntElementos){
			dobraTamanho(minhaPilhaInterna);
		}
		minhaPilhaInterna[qntElementos++] = o;
	}
	
	/*public Object pop (Object o){
		//int percorre = 0;
		for (int i = 0; i< minhaPilhaInterna.length; i++){
			if(minhaPilhaInterna[i] == o){
				return o;
				}minhaPilhaInterna[i] = null;
		}
		return null;
	}*/
	/**
	 * remove ultimo elemento que foi adicionado a pilha
	 */
	public void pop(){
		minhaPilhaInterna[qntElementos-1] = null;
		qntElementos--;
	}
	/**
	 * método top, que retorna o ultimo elemento adicionado a pilha
	 * @return ultimo elemento adicionado a pilha
	 */
	public Object top(){
		return minhaPilhaInterna[qntElementos-1];
	}
	/**
	 * dobra o tamanho do array
	 * @param recebe o array que vai ter seu tamanho alterado para o dobro do tamanho atual
	 */
	public void dobraTamanho(Object array1[]){
		Object array2[] = new Object[array1.length * 2];
		for(int i = 0; i <= array1.length; i++){
			array2[i] = array1[i];
		}
		array2 = array1;
	}
}
