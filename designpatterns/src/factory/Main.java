package factory;

public class Main {

	public static void main(String[] args) {
		
		FiatFactory fiatCG = new FiatFactory("Campina Grande");
		
		Carro uno1 = fiatCG.criarUno("vermelho");
		
		System.out.println(uno1.marca + " " + uno1.modelo + " " + uno1.cor);

	}

}
