package observer;

import java.util.ArrayList;

public class Termometro {
	
	private double temp;
	
	private ArrayList<Leitor> leitores = new ArrayList<Leitor>();

	
	public void addLeitor(Leitor l) {
		leitores.add(l);
	}
	
	public void notificaLeitores() {
		for (Leitor leitor : leitores) {
			leitor.setTemp(this.temp);
		}
	}
	
	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
		this.notificaLeitores();
	}
}
