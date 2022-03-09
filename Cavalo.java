package Polimorfismo;

public class Cavalo extends Animal{

	private String coloracao;
	
	
	public String getColoracao() {
		return coloracao;
	}

	public void setColoracao(String coloracao) {
		this.coloracao = coloracao;
	}

	public void correr() {
		System.out.println("Cavalo correndo pocotó pocotó!!");
	}

	public void somAnimal() {
		System.out.println("Cavalo relichando ihiiiiii ihiiiii!");
	}
}
