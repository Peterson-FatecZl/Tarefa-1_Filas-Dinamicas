package model;

public class filaGenerica<T> {

	No<T> inicio;
	No<T> fim;

	public filaGenerica() {
		inicio = null;
		fim = inicio;
	}

	public boolean isEmpty() {
		if (inicio == null && inicio == fim) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(T dado) {
		No<T> elemento = new No<T>();
		elemento.dado = dado;
		elemento.proximo = null;
		if (isEmpty()) {
			inicio = elemento;
			fim = inicio;
		} else {
			fim.proximo = elemento;
			fim = elemento;
		}
	}

	public T remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		T dado = inicio.dado;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = inicio;

		} else {
			inicio = inicio.proximo;
		}
		return dado;
	}

	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		No<T> auxiliar = inicio;
		while (auxiliar != null) {
			System.out.println(auxiliar.dado + " ");
			auxiliar = auxiliar.proximo;
		}
		System.out.println("");
	}


	public int size() throws Exception {
		int ctd = 0;
		if(isEmpty()) {
			throw new Exception("Fila Vazia");
		}else {
			No<T> auxiliar = inicio;
			while (auxiliar != null) {
				auxiliar = auxiliar.proximo;
				ctd ++;
			}
		}
		return ctd;
	}

}
