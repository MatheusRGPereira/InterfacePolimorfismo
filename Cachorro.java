package Polimorfismo;

public class Cachorro extends Animal{

	private String porte;
	
	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public void correr() {
			System.out.println("Cachorro está correndo!!");
	}

	public void somAnimal() {
			System.out.println("Cachorro latindo AU AU AU !!!");
	}
}
