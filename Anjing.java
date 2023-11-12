package UTS;

public class Anjing extends Hewan{
	public Anjing(String jenisSuara) {
		super("Gug Gug");
	}
	
	public void bersuara() {
		System.out.println("Suara Anjing: "+jenisSuara);
	}
	
	public void jenis() {
		System.out.println("Hewan ini adalah Mamalia");
	}

}
