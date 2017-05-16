package br.com.cesed.si.p3.classes;

/**
 * Class for my own implementation of ArrayList
 * 
 * @author aluno
 *
 */
public class ArrayListFacisa {

	private Object[] meuArrayInterno;
	private int inseridos;
	
	/**
	 * Constructor 
	 * 
	 * @param tamanho the initial size of ArrayList
	 */
	public ArrayListFacisa(int tamanho) {
		this.meuArrayInterno = new Object[tamanho];
	}
	
	/**
	 * Return the size of ArrayList.
	 * 
	 * @return
	 */
	public int size() {
		return inseridos;
	}
	
	/**
	 * Add an object
	 * 
	 * @param obj
	 */
	public void add(Object obj) {

		//validação se já alcançou o limite, se alcançou dobra o tamanho
		if(inseridos >= meuArrayInterno.length) {
			
			Object[] meuArrayMaior = new Object[meuArrayInterno.length * 2];
			
			for (int i = 0; i < meuArrayInterno.length; i++) {
				meuArrayMaior[i] = meuArrayInterno[i];
			}
			
			meuArrayInterno = meuArrayMaior;
		}
		
		//inserção normal
		meuArrayInterno[inseridos++] = obj;
	}
	
	/**
	 * Remove an object
	 * 
	 * @param obj
	 */
	/**
	 * remoção do bug:
	 * Removi a condição do if que era desnecessária	
	 */
	public void remove(Object obj) {

		int posicaoElemento = findPosition(obj);
		//if(posicaoElemento != -1) {
			for(int i = posicaoElemento; i < inseridos; i++) {
				meuArrayInterno[i] = meuArrayInterno[i+1]; 
			}
		//}
		
		inseridos--;
	}
	
	
	/**
	 * Get the object by index.
	 * 
	 * For example, if I pass index as 0, this method will return the persisted value at first position of Array.
	 *  
	 * @param index index in Array
	 */
	public Object getByIndex(int index) {

		Object obj = null;
		
		if(index < meuArrayInterno.length) {
			obj = meuArrayInterno[index];
		}
		
		return obj;
	}

	/**
	 * Check the position of the informed object.
	 * 
	 * @param obj
	 * @return
	 */
	public int findPosition(Object obj) {

		int posicao = -1;
		
		if(obj != null && meuArrayInterno.length > 0) {

			for (int i = 0; i < meuArrayInterno.length; i++) {
				
				if(meuArrayInterno[i].equals(obj)) {
					posicao = i;
					break;
				}
			}
		}
		
		return posicao;
	}
	
	public void printAllElements() {

		for (Object object : meuArrayInterno) {
			System.out.println(object);
		}
	}
	
}
