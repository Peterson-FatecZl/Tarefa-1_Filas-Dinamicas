package view;

import javax.swing.JOptionPane;

import controller.FilaController;
import model.filaGenerica;

public class Principal {

	public static void main(String[] args) throws Exception {
		FilaController controller = new FilaController();
		filaGenerica<Integer> fila = new filaGenerica<>();
		filaGenerica<Integer> filaPrioritaria = new filaGenerica<>();

		int opcao = 0;
		while (opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1 - Chamar Pessoa para Atendimento\n"
					+ "2 - Inserir nova senha na Fila\n"
					+ "3 - Inserir nova senha na Fila de Prioritários\n"
					+ "9 - Sair",
					"Insira a opção Desejada", -1));
			switch (opcao) {
			case 1:
				if((!fila.isEmpty())||(!filaPrioritaria.isEmpty())) {
					controller.chamarSenha(fila, filaPrioritaria);
					break;
				}else {
					System.out.println("As Filas Estão Vazias!");
					break;
				}
			case 2:
				controller.inserirNovoElemento(fila);
				break;
			case 3:
				controller.inserirNovoElemento(filaPrioritaria);
				break;
			case 9:
				// pass
				break;
			default:
				System.err.println("Por Favor Insira um valor Válido!");
				break;
			}
		}
	}

}
