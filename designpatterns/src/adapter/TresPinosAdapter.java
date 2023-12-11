package adapter;

public class TresPinosAdapter extends DoisPinos{
	
	private TresPinos tresPinos;
	
	public void teste() {
		this.tresPinos.teste();
		System.out.println("atraves de um adapter");
	}

	public TresPinos getTresPinos() {
		return tresPinos;
	}

	public void setTresPinos(TresPinos tresPinos) {
		this.tresPinos = tresPinos;
	}
	
}
