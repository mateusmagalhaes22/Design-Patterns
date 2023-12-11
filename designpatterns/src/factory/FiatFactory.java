package factory;

public class FiatFactory {
	
	public String local;
	
	public FiatFactory(String local) {
		this.local = local;
	}
	
	public Carro criarToro(String cor) {
		return new Carro("Fiat", "Toro", this.local, cor, 0);
	}
	
	public Carro criarSiena(String cor) {
		return new Carro("Fiat", "Siena", this.local, cor, 0);
	}
	
	public Carro criarPalio(String cor) {
		return new Carro("Fiat", "Palio", this.local, cor, 0);
	}
	
	public Carro criarUno(String cor) {
		return new Carro("Fiat", "Uno", this.local, cor, 0);
	}
	
}
