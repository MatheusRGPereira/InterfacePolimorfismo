package Polimorfismo;


public class AnimalFinal {

	public static void main(String[] args) {
		AcaoAnimal a =new AcaoAnimal();
		Cachorro dog = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica pre = new Preguica();
		
		dog.setNome("Meg");
		dog.setIdade(10);
		dog.setFamilia("Canina");
		dog.setRaca("shitzu");
		dog.setPorte("Pequeno");
		
		System.out.println("As informações do cachorro é ");
		System.out.println();
		
		System.out.println("Nome: "+dog.getNome());
		System.out.println("Idade: "+ dog.getIdade());
		System.out.println("Familia: "+dog.getFamilia());
		System.out.println("Raça: "+dog.getRaca());
		System.out.println("Porte: "+ dog.getPorte());
		
		System.out.println();
		a.animalCorre(new Cachorro());
		System.out.println();
		a.animalFazSom(new Cachorro());
		System.out.println();
		
		cav.setNome("Snow");
		cav.setIdade(17);
		cav.setFamilia("Equina");
		cav.setRaca("Shire");
		cav.setColoracao("Preto com patas brancas");
		
		System.out.println("As informaçoes do cavalo é ");
		System.out.println();
		
		System.out.println("Nome: "+cav.getNome());
		System.out.println("Idade: "+ cav.getIdade());
		System.out.println("Familia: "+cav.getFamilia());
		System.out.println("Raça: "+cav.getRaca());
		System.out.println("Coloração: "+cav.getColoracao());
		
		System.out.println();
		
		a.animalFazSom(new Cavalo());
		System.out.println();
		a.animalCorre(new Cavalo());
		System.out.println();
		
		pre.setNome("cuca");
		pre.setIdade(32);
		pre.setFamilia("Choloepus");
		pre.setRaca("Preguiça-real");
		pre.setHabitat("Mata atlantica/Amazonha");
		
		System.out.println("As informações da preguiça é ");
		System.out.println();
		
		System.out.println("Nome: "+pre.getNome());
		System.out.println("Idade: "+ pre.getIdade());
		System.out.println("Familia: "+pre.getFamilia());
		System.out.println("Raça: "+pre.getRaca());
		System.out.println("Habitat: "+pre.getHabitat());
		
		System.out.println();
		a.animalFazSom(new Preguica());
		System.out.println();
		a.animalEscala(new Preguica());
		
		
		
	

		
	}

}
