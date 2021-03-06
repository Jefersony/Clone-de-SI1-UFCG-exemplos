package si20121.solucao.mv.mc;

import si20121.solucao.mvc.view.XYView;

/**
 * O Controller da lógica do domínio do problema.
 * 
 * @author nazareno
 * 
 */
public class SistemaDeRegistro {

	private RegistroDeEstatisticas registroDeEstatisticas;

	public SistemaDeRegistro() {
		this.registroDeEstatisticas = new RegistroDeEstatisticas();
	}

	public void adicionaDados() {
		// delegar o trabalho:
		this.registroDeEstatisticas.adicionaDados();
		/*
		 * Poderia colaborar com mais objetos do domínio do problema, desde que
		 * sempre delegando a lógica para eles.
		 */
	}

	public void cadastraInteressadoNaLogica(InteressadoNaLogica view) {
		this.registroDeEstatisticas.cadastraInteressado(view);
	}
}
