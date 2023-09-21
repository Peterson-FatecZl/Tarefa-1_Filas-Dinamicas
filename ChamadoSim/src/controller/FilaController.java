package controller;

import model.filaGenerica;

public class FilaController {
	private int controleDeChamadaDeSenha = 0;

	public FilaController() {
		super();
	}

	public void inserirNovoElemento(filaGenerica<Integer> Fila) throws Exception {

		if (Fila.isEmpty()) {
			Fila.insert(1);
		} else {
			int senha = Fila.size() + 1;
			Fila.insert(senha);
		}
	}

	public void chamarSenha(filaGenerica<Integer> fila, filaGenerica<Integer> filaPreferencial) throws Exception {
		if (!filaPreferencial.isEmpty() && controleDeChamadaDeSenha < 3) {
			System.out.println("Senha: P" + filaPreferencial.remove());
			controleDeChamadaDeSenha += 1;
		} else {
			System.out.println("Senha: " + fila.remove());
			controleDeChamadaDeSenha = 0;
		}
	}

}
