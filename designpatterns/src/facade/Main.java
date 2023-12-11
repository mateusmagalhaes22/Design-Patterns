package facade;

public class Main {

	public static void main(String[] args) {
		
		Transacoes t = new Transacoes();
		Consultas c = new Consultas();
		Ajuda a = new Ajuda();
		CaixaFacade facade = new CaixaFacade(a, c, t);
		
		facade.pix();
		facade.getSaldo();
		facade.pedeAjuda();

	}

}
