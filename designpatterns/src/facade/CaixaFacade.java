package facade;

public class CaixaFacade {
	
	Ajuda ajuda;
	Consultas consultas;
	Transacoes transacoes;
	
	public CaixaFacade(Ajuda ajuda, Consultas consultas, Transacoes transacoes) {
		this.ajuda = ajuda;
		this.consultas = consultas;
		this.transacoes = transacoes;
	}
	
	public void pix() {
		transacoes.pix();
	}
	
	public void getSaldo() {
		consultas.getSaldo();
	}
	
	public void pedeAjuda() {
		ajuda.pedeAjuda();
	}
	
}
