package adapter;

public class Main {

	public static void main(String[] args) {
		
		DoisPinos doisPinos = new DoisPinos();
		TresPinosAdapter tresPinosAdapter = new TresPinosAdapter();
		TresPinos tresPinos = new TresPinos();
		
		tresPinosAdapter.setTresPinos(tresPinos);
		
		tresPinos.teste();
		doisPinos.teste();
		tresPinosAdapter.teste();

	}

}
