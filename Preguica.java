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
			System.out.println("Pregui�a subindo arvore");
	}

	public void somAnimal() {
		System.out.println("Preuigui�a emitindo som uiooooo uiooo!");
	}
}
