package model;

public class No<T> {//tipo Genérico T;
	T dado;
	No<T> proximo;
	
	@Override 
	public String toString() {
		return "[" + dado + "]";
	}
}
