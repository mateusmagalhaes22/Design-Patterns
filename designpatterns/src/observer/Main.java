package observer;

public class Main {

	public static void main(String[] args) {
		
		Termometro t = new Termometro();
		Leitor l1 = new Leitor();
		Leitor l2 = new Leitor();
		Leitor l3 = new Leitor();
		t.addLeitor(l1);
		t.addLeitor(l2);
		t.addLeitor(l3);
		
		System.out.println(t.getTemp());
		System.out.println(l1.getTemp());
		System.out.println(l2.getTemp());
		System.out.println(l3.getTemp());
		
		t.setTemp(29.3);
		
		System.out.println(t.getTemp());
		System.out.println(l1.getTemp());
		System.out.println(l2.getTemp());
		System.out.println(l3.getTemp());

	}

}
