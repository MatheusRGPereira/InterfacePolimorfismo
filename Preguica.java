package Polimorfismo;

public class Preguica extends Animal {

	private String habitat;
	
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public void escalar() {
			System.out.println("Preguiça subindo arvore");
	}

	public void somAnimal() {
		System.out.println("Preuiguiça emitindo som uiooooo uiooo!");
	}
}
