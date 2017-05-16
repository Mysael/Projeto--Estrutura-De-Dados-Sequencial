package br.com.cesed.si.p3.classes;

public class DequeFacisa {
	private int numElementos;
	private Object[] meuDeckInterno;
	
	public DequeFacisa(int tamanho){
		this.meuDeckInterno = new Object[tamanho];
	}

	public void adicionaNoComeco(Object o){
		if (meuDeckInterno.length == numElementos){
			dobraTamanho(meuDeckInterno);
		}
		if (meuDeckInterno[0] == null){
			meuDeckInterno[0] = o;
			numElementos++;
		}
		for(int i = 1; i < meuDeckInterno.length; i++){
			if(meuDeckInterno[i] == null){
				while (i>0){
					meuDeckInterno[i] = meuDeckInterno[i+1];
					i--;
				} meuDeckInterno[0] = o;
				numElementos++;
			}
		}
	}
	//TODO corrigir adicionaNoFinal, se tiver as 3 primeiras posições ocupadas, esse metodo deve adicionar na quarta, e nn na ultima posição do array
	public void adicionaNoFinal(Object o){
		if (meuDeckInterno.length == numElementos){
			dobraTamanho(meuDeckInterno);
		}
		meuDeckInterno[numElementos-1] = o;
		numElementos++;
	}
	
	public void removeNoComeco(){
		meuDeckInterno[0]= null;
		numElementos--;
		for (int i = 0; i<numElementos-1; i++){
			meuDeckInterno[i] = meuDeckInterno [i+1];
		}
	}
	public void removeNoFinal(){
		meuDeckInterno[numElementos-1] = null;
	}
	
	public  Object verPrimeiro(){
		return meuDeckInterno[0];
	}
	
	public Object verUltimo(){
		return meuDeckInterno[numElementos-1];
	}
	
	
	public void dobraTamanho(Object array1[]){
		Object array2[] = new Object[array1.length * 2];
		for(int i = 0; i <= array1.length; i++){
			array2[i] = array1[i];
		}
		array2 = array1;
	}
	
	
}

